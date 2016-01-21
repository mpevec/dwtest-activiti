package io.dwtest.config;

import io.dropwizard.Configuration;

import javax.validation.Valid;


public class DwConfiguration extends Configuration {

	@Valid
	private DwActivitiConfiguration activiti;

	public DwActivitiConfiguration getActiviti() {
		return activiti;
	}

	public void setActiviti(DwActivitiConfiguration activiti) {
		this.activiti = activiti;
	}
}

