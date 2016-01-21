package io.dwtest.config;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by pevecmi on 20/01/2016.
 */
public class DwActivitiConfiguration {

	@NotEmpty
	private String jdbcUrl;

	@NotEmpty
	private String jdbcUsername;

	@NotEmpty
	private String jdbcPassword;

	@NotEmpty
	private String jdbcDriver;

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public String getJdbcUsername() {
		return jdbcUsername;
	}

	public void setJdbcUsername(String jdbcUsername) {
		this.jdbcUsername = jdbcUsername;
	}

	public String getJdbcPassword() {
		return jdbcPassword;
	}

	public void setJdbcPassword(String jdbcPassword) {
		this.jdbcPassword = jdbcPassword;
	}

	public String getJdbcDriver() {
		return jdbcDriver;
	}

	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}
}
