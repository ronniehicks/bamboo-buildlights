package com.github.hrhdaniel.buildlights.bamboo.listeners;

import java.util.logging.Logger;

// import com.atlassian.bamboo.deployments.execution.events.DeploymentFinishedEvent;
// import com.atlassian.bamboo.deployments.projects.DeploymentProject;
// import com.atlassian.bamboo.deployments.projects.service.DeploymentProjectService;
// import com.atlassian.bamboo.deployments.results.DeploymentResult;
// import com.atlassian.bamboo.deployments.results.service.DeploymentResultService;
// import com.atlassian.bamboo.variable.VariableDefinition;
// import com.atlassian.bamboo.variable.VariableDefinitionManager;
// import com.atlassian.event.api.EventListener;



public class BuildLightsDeploymentEventListener {
    // private final DeploymentResultService deploymentResultService;
    // private final DeploymentProjectService deploymentProjectService;
    // private final VariableDefinitionManager variables;

    public BuildLightsDeploymentEventListener(/*DeploymentResultService deploymentResultService,
            DeploymentProjectService deploymentProjectService, VariableDefinitionManager variables*/) {
        // this.deploymentResultService = deploymentResultService;
        // this.deploymentProjectService = deploymentProjectService;
        // this.variables = variables;
    }

    private static Logger logger = LoggerFactory.getLogger(BuildLightsDeploymentEventListener.class);

    // @EventListener
    // public void buildFinishedEvent(BuildFinishedEvent buildFinishedEvent) {
    // metricCollector.finishedBuildsCounter(buildFinishedEvent.getBuildPlanKey(),
    // buildFinishedEvent.getBuildState().name());
    // }

    // @EventListener
    // public void buildCanceledEvent(BuildCanceledEvent buildCanceledEvent) {
    // metricCollector.canceledBuildsCounter(buildCanceledEvent.getBuildPlanKey());
    // }

    // @EventListener
    // public void bambooErrorEvent(BambooErrorEvent bambooErrorEvent) {
    // metricCollector.errorsCounter(bambooErrorEvent.isNewError());
    // }

    // @EventListener
    // public void buildQueueTimeoutEvent(BuildQueueTimeoutEvent
    // buildQueueTimeoutEvent) {
    // metricCollector.buildQueueTimeoutCounter(buildQueueTimeoutEvent.getBuildPlanKey());
    // }

    // @EventListener
    public void deploymentFinishedEvent(/*DeploymentFinishedEvent deploymentFinishedEvent*/) {
        // VariableDefinition clientIdVar = variables.getGlobalVariableByKey("lights.clientId");
        // VariableDefinition lightsURLVar = variables.getGlobalVariableByKey("lights.url");

        // if (clientIdVar == null) {
        // logger.warn(
        // "lights.clientId global variable not set. No build information will be sent
        // to lights status server");
        // return;
        // }

        // if (lightsURLVar == null) {
        // logger.warn(
        // "lights.url global variable not set. No build information will be sent to
        // lights status server");
        // return;
        // }

        // DeploymentResult deploymentResult = deploymentResultService
        //         .getDeploymentResult(deploymentFinishedEvent.getDeploymentResultId());
        // DeploymentProject deploymentProject = deploymentProjectService
        //         .getDeploymentProject(deploymentResult.getEnvironment().getDeploymentProjectId());

        // if (deploymentResult == null || deploymentProject == null) {
        //     logger.warn("Can't get deployment project or result");
        // }

        // logger.info("Got a result: {}", deploymentResult.getDeploymentState());

        // boolean success;

        // switch (deploymentResult.getDeploymentState()) {
        // case SUCCESS:
        // success = true;
        // break;
        // case FAILED:
        // success = false;
        // break;
        // default:
        // // Unknown state. Do not send light updates.
        // return;
        // }

        // String projectKey = deploymentProject.getKey().getKey();
        // String planKey = deploymentProject.getPlanKey().getKey();
        // String buildNo = deploymentResult.getDeploymentVersion().getName();
        // String clientId = clientIdVar.getValue();
        // String lightsUrl = lightsURLVar.getValue();
        // String buildId = projectKey + "-" + planKey;

        // RestTemplate rest = new RestTemplate();

        // HttpHeaders headers = new HttpHeaders();
        // headers.add("X_CLIENT_ID", clientId);

        // String url = lightsUrl + "/buildstatus/" + buildId;

        // Map<String, Object> status = new HashMap<>();
        // status.put("BuildStatus", success);
        // status.put("BuildNumber", buildNo);
        // HttpEntity<Map<String, Object>> request = new HttpEntity<>(status, headers);

        // logger.info(projectKey);
        // logger.info(planKey);
        // logger.info(buildNo);
        // logger.info(clientId);
        // logger.info(buildId);
        // logger.info(url);

        // rest.exchange(url, HttpMethod.PUT, request, String.class);
    }
}
