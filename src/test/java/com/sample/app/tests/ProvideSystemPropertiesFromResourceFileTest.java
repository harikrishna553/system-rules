package com.sample.app.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ProvideSystemProperty;

public class ProvideSystemPropertiesFromResourceFileTest {
	private static final String COUNTRY_KEY = "country";
	private static final String STATE_KEY = "state";

	@Rule
	public final ProvideSystemProperty properties = ProvideSystemProperty.fromResource("/custom-demo.properties");

	@BeforeClass
	public static void beforeAllTests() {
		System.out.println("In beforeAllTests()");

		System.setProperty(COUNTRY_KEY, "no_country");
		System.setProperty(STATE_KEY, "no_state");

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
	public void sysPropTest() {
		System.out.println("\nIn sysPropTest()");
		System.out.println("\t" + COUNTRY_KEY + "-> " + System.getProperty(COUNTRY_KEY));
		System.out.println("\t" + STATE_KEY + "-> " + System.getProperty(STATE_KEY));

		assertEquals(System.getProperty(COUNTRY_KEY), "India");
		assertEquals(System.getProperty(STATE_KEY), "Andhra Pradesh");
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
