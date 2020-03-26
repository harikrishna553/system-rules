package com.sample.app.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class SystemOutErrClearLog {
	@Rule
	public final SystemErrRule systemErrRule = new SystemErrRule().enableLog();

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void clearErrorLog() {
		System.err.print("Hello World");

		systemErrRule.clearLog();

		System.err.print("ABCD");

		assertEquals("ABCD", systemErrRule.getLog());

	}

	@Test
	public void clearOutLog() {
		System.out.print("Hello World");

		systemOutRule.clearLog();

		System.out.print("ABCD");

		assertEquals("ABCD", systemOutRule.getLog());
	}
}
