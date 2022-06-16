package com.pages;

import com.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //Page Factory or Object Repository
    @FindBy(name="email")
    WebElement email;

    @FindBy(name="pass")
    WebElement password;

    @FindBy(name="login")
    WebElement login;

    //xpath taken as input
    @FindBy(xpath="//a[contains(text(),'Create New Account')]")
    WebElement createNewAccount;

    //created own xpath of facebook logo
    @FindBy(xpath="//img[contains(@class,'_97vu img')]")
    WebElement facebookLogo;

    //Initializing Page Objects
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    //Actions
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean validatefbImage(){
        return facebookLogo.isDisplayed();
    }

    public HomePage login(String eid, String pwd){
            email.sendKeys(eid);
            password.sendKeys(pwd);
            login.click();

            return new HomePage();
    }
}
