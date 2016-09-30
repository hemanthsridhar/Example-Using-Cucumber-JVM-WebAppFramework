package org.projectname.pageobjects;

import org.framework.controller.MainController;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.projectname.initializer.PageFactoryInitializer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by hemanthsridhar on 9/23/16.
 */
public class ProductDetailsPageObjects extends PageFactoryInitializer{

    MainController mainController = new MainController();

    @FindBy(how= How.XPATH, using = "//li[@id='mPartNo']/descendant::span")
    private WebElement mpnValue;

    @FindBy(how= How.XPATH, using = "//li[@id='sitePartNo']/descendant::span")
    private WebElement pnValue;


    public ProductDetailsPageObjects verifyPartNumber(String textSearched) {
        Assert.assertEquals("verify part number has failed",textSearched,pnValue.getText().trim());
        Assert.assertTrue(false);
        return this;
    }

    public ProductDetailsPageObjects verifyMPN(String textSearched) {
        Assert.assertEquals("verify manufacturer part number has failed",textSearched,mpnValue.getText().trim());
        Assert.assertTrue(false);
        return this;
    }
}
