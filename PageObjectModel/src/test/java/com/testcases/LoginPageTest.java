package com.testcases;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;


    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {
        String title = loginPage.validateLoginPageTitle();
        System.out.println("Title of page: " + title);
        Assert.assertEquals(title, "Log in to Facebook");
    }

    @Test(priority = 2)
    public void fbLogoImageTest() {
        boolean flag = loginPage.validatefbImage();
        Assert.assertTrue(flag);
    }

    @Test(priority = 3)
    public void loginTest() {
        homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("pass"));
    }

    @AfterMethod
    public void closeDown() {
        driver.quit();
    }
}
