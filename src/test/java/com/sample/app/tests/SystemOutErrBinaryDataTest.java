package com.sample.app.tests;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class SystemOutErrBinaryDataTest {
	@Rule
	public final SystemErrRule systemErrRule = new SystemErrRule().enableLog();

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void newLineText() {
		byte[] data = { 2, 3, 5, 7, 11 };

		System.err.write(data, 0, data.length);
		System.out.write(data, 0, data.length);

		assertArrayEquals(data, systemErrRule.getLogAsBytes());
		assertArrayEquals(data, systemOutRule.getLogAsBytes());
	}
}
