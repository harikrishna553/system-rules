package com.sample.app.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

public class EnvironmentVariablesTest {
	@Rule
	public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

	private static final String COUNTRY_KEY = "country";
	private static final String STATE_KEY = "state";

	private void printEnvProps() {
		System.out.println(COUNTRY_KEY + "-> " + System.getenv(COUNTRY_KEY));
		System.out.println(STATE_KEY + "-> " + System.getenv(STATE_KEY));
	}

	@Test
	public void test() {
		printEnvProps();

		System.out.println("\nSetting Environment Variables\n");
		environmentVariables.set(COUNTRY_KEY, "India");
		environmentVariables.set(STATE_KEY, "Andhra Pradesh");

		assertEquals("India", System.getenv(COUNTRY_KEY));
		assertEquals("Andhra Pradesh", System.getenv(STATE_KEY));

		printEnvProps();

		System.out.println("\nClearning the key 'country'\n");
		environmentVariables.clear(COUNTRY_KEY);

		assertNull(System.getenv(COUNTRY_KEY));
		assertEquals("Andhra Pradesh", System.getenv(STATE_KEY));

		printEnvProps();
	}

}
