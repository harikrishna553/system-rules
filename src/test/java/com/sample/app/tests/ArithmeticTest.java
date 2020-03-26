package com.sample.app.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import com.sample.app.Arithmetic;

public class ArithmeticTest {
	@Rule
	public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

	private Arithmetic arithemtic = new Arithmetic();

	@Test
	public void sumOf1And2() {
		systemInMock.provideLines("1", "2");
		assertEquals(3, arithemtic.sum());
	}
}
