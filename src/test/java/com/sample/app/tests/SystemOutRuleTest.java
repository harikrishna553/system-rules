package com.sample.app.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class SystemOutRuleTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void writesTextToSystemOut() {
		System.out.print("Hello How Are You!!!!");

		assertEquals("Hello How Are You!!!!", systemOutRule.getLog());
	}
}
