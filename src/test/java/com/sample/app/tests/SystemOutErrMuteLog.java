package com.sample.app.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class SystemOutErrMuteLog {
	@Rule
	public final SystemErrRule systemErrRule = new SystemErrRule().enableLog().muteForSuccessfulTests();

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog().muteForSuccessfulTests();

	@Test
	public void newLineText() {
		String msg = "Hello World";

		System.err.print(msg);
		System.out.print(msg);

		assertEquals(msg, systemErrRule.getLog());
		assertEquals(msg, systemOutRule.getLog());
	}
}
