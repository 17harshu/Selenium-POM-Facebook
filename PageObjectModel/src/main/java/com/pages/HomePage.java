package com.pages;

import com.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @FindBy(xpath="//span[contains(text(),'Harshal Anandas Bojja')]")
    WebElement profileLink;

    @FindBy(xpath="//span[contains(text(),'Friends')]")
    WebElement friendsLink;

    @FindBy(xpath="//span[contains(text(),'Groups')]")
    WebElement groupsLink;

    //Initializing page object
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public String verifyHomePagetitle(){
        return driver.getTitle();
    }

    public ProfilePage clickOnProfileLink(){
        profileLink.click();
        return new ProfilePage();
    }

    public FriendsPage clickOnFriendsLink(){
        friendsLink.click();
        return new FriendsPage();
    }
}
