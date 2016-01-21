package io.dwtest.config;

public class ConfigurationHolder {
	private static DwConfiguration configuration;

	public static DwConfiguration get() {
		return configuration;
	}

	public static void set(DwConfiguration configuration) {
		ConfigurationHolder.configuration = configuration;
	}
}
