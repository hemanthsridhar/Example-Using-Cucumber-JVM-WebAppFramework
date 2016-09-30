package org.projectname.pageobjects;

import org.framework.controller.MainController;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.projectname.initializer.PageFactoryInitializer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by hemanthsridhar on 9/23/16.
 */
public class LoginPopUpPageObjects extends PageFactoryInitializer{

    MainController mainController = new MainController();

    @FindBy(how= How.ID, using = "popUserName")
    private WebElement userName;

    @FindBy(how= How.ID, using = "popPassword")
    private WebElement password;

    @FindBy(how= How.ID, using = "popLoginBtn")
    private WebElement loginButton;


    public LoginPopUpPageObjects enterUsername(String userName) {
        this.userName.sendKeys(userName);
        return this;
    }

    public LoginPopUpPageObjects enterPassword(String password) {
        this.password.sendKeys(password);
        return this;
    }

    public LoginPopUpPageObjects clickOnLoginButton() {
        loginButton.click();
        return this;
    }
}
