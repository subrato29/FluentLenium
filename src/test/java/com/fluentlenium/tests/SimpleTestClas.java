package com.fluentlenium.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.Test;

@Wait
public class SimpleTestClas extends FluentTest {

	@Test
	public void swagLabsTitleTest() {
		goTo("https://www.saucedemo.com/");
		$("#user-name").fill().with("standard_user");
		$("#password").fill().with("secret_sauce");
		$("#password").submit();
		assertThat(window().title()).contains("Swag Labs");
	}

}