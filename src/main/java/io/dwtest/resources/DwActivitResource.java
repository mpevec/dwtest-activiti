package io.dwtest.resources;

import io.dwtest.cdi.bindings.StandaloneBinding;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("activiti")
public class DwActivitResource {

	@Inject
	@StandaloneBinding
	private ProcessEngine processEngine;

	@GET
	@Path("hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String justTextMessage() {

		RepositoryService repositoryService = processEngine.getRepositoryService();
		RuntimeService runtimeService = processEngine.getRuntimeService();

		Deployment deployment = repositoryService.createDeployment().addClasspathResource("helloWorldGroovy.bpmn20.xml").deploy();

		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("helloWorld");
		return processInstance.getId();
	}
}
