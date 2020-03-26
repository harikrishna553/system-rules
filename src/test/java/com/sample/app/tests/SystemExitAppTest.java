package com.sample.app.tests;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import com.sample.app.SystemExitApp;

public class SystemExitAppTest {
	@Rule
	public final ExpectedSystemExit exit = ExpectedSystemExit.none();

	@Test
	public void exitApp() {
		exit.expectSystemExitWithStatus(0);

		SystemExitApp app = new SystemExitApp();

		app.exitApp();
	}

}
