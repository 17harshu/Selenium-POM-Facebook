package com.testcases;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    ProfilePage profilePage;

    public ProfilePageTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        profilePage = new ProfilePage();
        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("pass"));
        profilePage = homePage.clickOnProfileLink();
    }

    @Test(priority = 1)
    public void verifyProfileLabelTest(){
        Assert.assertTrue(profilePage.verifyProfileLabel(), "contacts label is missing");
    }

    @AfterMethod
    public void closeDown(){
        driver.quit();
    }


}
