package io.dwtest;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.test.ActivitiRule;
import org.activiti.engine.test.Deployment;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

/**
 * Created by pevecmi on 20/01/2016.
 */
public class RuntimeServiceTest {

	@Rule
	public ActivitiRule activitiRule = new ActivitiRule(ProcessEngineConfiguration.createStandaloneInMemProcessEngineConfiguration().buildProcessEngine());

	@Test
	@Deployment(resources={"helloWorldGroovy.bpmn20.xml"})
	public void startProcessInstance() {
		Map<String, Object> variableMap = new HashMap<String, Object>();
		variableMap.put("isbn", "123456");
		ProcessInstance processInstance = activitiRule.getRuntimeService().startProcessInstanceByKey("helloWorld", variableMap);
		assertNotNull(processInstance.getId());
		System.out.println("id " + processInstance.getId() + " " + processInstance.getProcessDefinitionId());
	}

}
