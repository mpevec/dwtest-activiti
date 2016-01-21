package io.dwtest.cdi.factories;

import io.dwtest.cdi.bindings.StandaloneBinding;
import io.dwtest.config.ConfigurationHolder;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;


public class ProjectEngineFactory {

	@ApplicationScoped
	@StandaloneBinding
	@Produces
	public ProcessEngine getProcessEngine() {
		ProcessEngine processEngine = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration()
		  .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_FALSE)
		  .setJdbcUrl(ConfigurationHolder.get().getActiviti().getJdbcUrl())
		  .setJdbcUsername(ConfigurationHolder.get().getActiviti().getJdbcUsername())
		  .setJdbcPassword(ConfigurationHolder.get().getActiviti().getJdbcPassword())
		  .setJdbcDriver(ConfigurationHolder.get().getActiviti().getJdbcDriver())
		  .setAsyncExecutorEnabled(true)
		  .setAsyncExecutorActivate(false)
		  .buildProcessEngine();

		return processEngine;
	}

}
