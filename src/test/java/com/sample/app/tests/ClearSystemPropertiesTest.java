package com.sample.app.tests;

import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ClearSystemProperties;

public class ClearSystemPropertiesTest {

	private static final String COUNTRY_KEY = "country";
	private static final String STATE_KEY = "state";

	@Rule
	public final ClearSystemProperties PROPS_TO_BE_CLEARED = new ClearSystemProperties(COUNTRY_KEY, STATE_KEY);

	@BeforeClass
	public static void beforeAllTests() {
		System.setProperty(COUNTRY_KEY, "India");
		System.setProperty(STATE_KEY, "Andhra Pradesh");

		System.out.println("In beforeAllTests()");
		System.out.println("\t" + COUNTRY_KEY + "-> " + System.getProperty(COUNTRY_KEY));
		System.out.println("\t" + STATE_KEY + "-> " + System.getProperty(STATE_KEY));
	}

	@Before
	public void setup() {
		System.out.println("\nIn setup()");
		System.out.println("\t" + COUNTRY_KEY + "-> " + System.getProperty(COUNTRY_KEY));
		System.out.println("\t" + STATE_KEY + "-> " + System.getProperty(STATE_KEY));
	}

	@Test
	public void clearSysPropTest() {
		System.out.println("\nIn clearSysPropTest()");
		System.out.println("\t" + COUNTRY_KEY + "-> " + System.getProperty(COUNTRY_KEY));
		System.out.println("\t" + STATE_KEY + "-> " + System.getProperty(STATE_KEY));

		assertNull(System.getProperty(COUNTRY_KEY));
		assertNull(System.getProperty(STATE_KEY));
	}

	@After
	public void cleanUp() {
		System.out.println("\nIn cleanUp()");
		System.out.println("\t" + COUNTRY_KEY + "-> " + System.getProperty(COUNTRY_KEY));
		System.out.println("\t" + STATE_KEY + "-> " + System.getProperty(STATE_KEY));
	}

	@AfterClass
	public static void afterAllTests() {
		System.out.println("\nIn afterAllTests()");
		System.out.println("\t" + COUNTRY_KEY + "-> " + System.getProperty(COUNTRY_KEY));
		System.out.println("\t" + STATE_KEY + "-> " + System.getProperty(STATE_KEY));
	}
}
