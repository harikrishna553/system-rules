package com.sample.app.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemErrRule;

public class SystemErrRuleTest {
	@Rule
	public final SystemErrRule systemErrRule = new SystemErrRule().enableLog();

	@Test
	public void writesTextToSystemErr() {
		System.err.print("You can't access the resource");
		assertEquals("You can't access the resource", systemErrRule.getLog());
	}
}


