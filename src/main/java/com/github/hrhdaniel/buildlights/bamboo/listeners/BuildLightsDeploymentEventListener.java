package com.github.hrhdaniel.buildlights.bamboo.listeners;

import com.atlassian.bamboo.deployments.execution.events.DeploymentFinishedEvent;
import com.atlassian.bamboo.deployments.projects.DeploymentProject;
import com.atlassian.bamboo.deployments.projects.service.DeploymentProjectService;
import com.atlassian.bamboo.deployments.results.service.DeploymentResultService;
import org.springframework.web.client.RestTemplate;
import com.atlassian.bamboo.variable.VariableDefinitionManager;
import com.atlassian.bamboo.variable.VariableDefinition;


public class BuildLightsDeploymentEventListener {
    private final DeploymentResultService deploymentResultService;
    private final DeploymentProjectService deploymentProjectService;
    private final VariableDefinitionManager variables;

    public BuildLightsDeploymentEventListener(DeploymentResultService deploymentResultService, DeploymentProjectService deploymentProjectService, VariableDefinitionManager variables) {
        this.deploymentProjectService = deploymentProjectService;
        this.deploymentResultService = deploymentResultService;
        this.variables = variables;
    }
}
