package com.fluentlenium.tests;

import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.Test;

import com.fluentlenium.tests.pageObjects.LoginPage;

@Wait
public class PageObjectTestClass extends FluentTest {

	@Page
	LoginPage loginPage;

	@Test
	public void titleOfDuckDuckGoShouldContainSearchQueryName() {

		goTo(loginPage).typeCredentials("standard_user", "secret_sauce").submitLogin();

	}
}