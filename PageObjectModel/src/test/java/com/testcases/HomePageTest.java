package com.testcases;

import com.base.TestBase;
import com.pages.FriendsPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    ProfilePage profilePage;
    FriendsPage friendsPage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("pass"));
    }

    @Test(priority = 1)
    public void verifyHomePageTitleTest() {
        String homePageTitle = homePage.verifyHomePagetitle();
        Assert.assertEquals(homePageTitle, "Log in to Facebook", "Home page title not matched"); //the last line will print only the assert fails
    }

    @Test(priority = 2)
    public void clickOnProfileLink() {
        profilePage = homePage.clickOnProfileLink();
    }

    @Test(priority = 3)
    public void clickOnFriendsLink() {
        friendsPage = homePage.clickOnFriendsLink();
    }

    @AfterMethod
    public void closeDown() {
        driver.quit();
    }


}
