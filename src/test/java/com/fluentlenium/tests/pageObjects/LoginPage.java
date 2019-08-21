package com.fluentlenium.tests.pageObjects;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

@PageUrl("https://www.saucedemo.com/")
public class LoginPage extends FluentPage {
	

    @FindBy(css = "#user-name")
    private FluentWebElement username;

    @FindBy(css = "#password")
    private FluentWebElement password;

    public LoginPage typeCredentials(String uname, String pwd) {
        username.write(uname);
        password.write(pwd);
        return this;
    }

    public LoginPage submitLogin() {
        password.submit();
        return this;
    }
}