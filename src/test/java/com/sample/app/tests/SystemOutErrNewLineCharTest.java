package com.sample.app.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class SystemOutErrNewLineCharTest {
	@Rule
	public final SystemErrRule systemErrRule = new SystemErrRule().enableLog();

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void newLineText() {
		String msg = "Hello\nHow\nAre\tYou\n";

		System.err.print(msg);
		System.out.print(msg);

		assertEquals(msg, systemErrRule.getLogWithNormalizedLineSeparator());
		assertEquals(msg, systemOutRule.getLogWithNormalizedLineSeparator());
	}
}
