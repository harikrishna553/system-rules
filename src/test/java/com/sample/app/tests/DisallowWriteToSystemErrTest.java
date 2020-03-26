package com.sample.app.tests;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.DisallowWriteToSystemErr;

public class DisallowWriteToSystemErrTest {
	@Rule
	public final DisallowWriteToSystemErr disallowWriteToSystemErr = new DisallowWriteToSystemErr();

	@Test
	public void thisTestFail() {
		System.err.println("Hello World");
	}
}
