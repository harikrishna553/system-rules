package com.sample.app.tests;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.DisallowWriteToSystemOut;

public class DisallowWriteToSystemOutTest {
	@Rule
	public final DisallowWriteToSystemOut disallowWriteToSystemOut = new DisallowWriteToSystemOut();

	@Test
	public void thisTestFail() {
		System.out.println("Hello World");
	}
}
