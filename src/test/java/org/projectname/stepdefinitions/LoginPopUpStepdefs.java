package org.projectname.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.projectname.initializer.PageFactoryInitializer;

/**
 * Created by hemanthsridhar on 9/23/16.
 */
public class LoginPopUpStepdefs extends PageFactoryInitializer {




    @And("^I enter username as \"([^\"]*)\"$")
    public void iEnterUsernameAs(String userName) throws Throwable {
        loginPopUp().enterUsername(userName);
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) throws Throwable {
        loginPopUp().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() throws Throwable {
        loginPopUp().clickOnLoginButton();
    }
}
