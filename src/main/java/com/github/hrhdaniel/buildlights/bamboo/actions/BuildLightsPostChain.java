package com.github.hrhdaniel.buildlights.bamboo.actions;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.atlassian.bamboo.chains.Chain;
import com.atlassian.bamboo.chains.ChainExecution;
import com.atlassian.bamboo.chains.ChainResultsSummary;
import com.atlassian.bamboo.chains.plugins.PostChainAction;
import com.atlassian.bamboo.variable.VariableDefinition;
import com.atlassian.bamboo.variable.VariableDefinitionManager;

public class BuildLightsPostChain implements PostChainAction {
	
	private VariableDefinitionManager variables;
	
	public BuildLightsPostChain(VariableDefinitionManager variables) {
		this.variables = variables;
	}

	private static Logger logger = LoggerFactory.getLogger(BuildLightsPostChain.class);

	public void execute(Chain chain, ChainResultsSummary chainResultsSummary, ChainExecution chainExecution)
			throws InterruptedException, Exception {
		
		if ( chain.getMaster() != null ) {
			// Do not send light updates for branch builds
			return;
		}
		
		VariableDefinition clientIdVar = variables.getGlobalVariableByKey("lights.clientId");
		VariableDefinition lightsURLVar = variables.getGlobalVariableByKey("lights.url");
		
		if ( clientIdVar == null ) {
			logger.warn("lights.clientId global variable not set.  No build information will be sent to lights status server");
			return;
		}
		
		if ( lightsURLVar == null ) {
			logger.warn("lights.url global variable not set.  No build information will be sent to lights status server");
			return;
		}
		
		boolean success;
		
		switch (chainResultsSummary.getBuildState()) {
		case SUCCESS:
			success = true;
			break;
		case FAILED:
			success = false;
			break;
		default:
			// Unknown state.  Do not send light updates.
			return;
		}
		
		String projectKey = chainResultsSummary.getImmutablePlan().getProject().getKey();
		String planKey = chainResultsSummary.getImmutablePlan().getBuildKey();
		int buildNo = chainResultsSummary.getBuildNumber();
		String clientId = clientIdVar.getValue();
		String lightsUrl = lightsURLVar.getValue();
		
		logger.info("--------------------- here");
		logger.info("clientId :" + clientId);
		logger.info("projectKey :" + projectKey);
		logger.info("planKey :" + planKey);
		logger.info("buildNo :" + buildNo);
		logger.info("success :" + success);
		logger.info("--------------------- here");
		
		// TODO send status to Lights URL
	}

}
