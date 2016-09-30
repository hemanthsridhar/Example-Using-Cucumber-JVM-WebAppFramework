package org.projectname.initializer;

import org.framework.controller.MainController;
import org.openqa.selenium.support.PageFactory;
import org.projectname.pageobjects.HomePageObjects;
import org.projectname.pageobjects.LoginPopUpPageObjects;
import org.projectname.pageobjects.ProductDetailsPageObjects;

/**
 * Created by hemanthsridhar on 9/22/16.
 */
public class PageFactoryInitializer {

   public MainController mainController = new MainController();
    public HomePageObjects homePage(){
        return PageFactory.initElements(mainController.getDriver(),HomePageObjects.class);
    }

    public LoginPopUpPageObjects loginPopUp(){
        return PageFactory.initElements(
                mainController.getDriver(),LoginPopUpPageObjects.class);
    }

    public ProductDetailsPageObjects productDetailsPage(){
        return PageFactory.initElements(
                mainController.getDriver(),ProductDetailsPageObjects.class);
    }
}
