package com.pages;

import com.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends TestBase {
    @FindBy(xpath = "//h1[contains(text(),'Harshal Anandas Bojja')]")
    WebElement profileLabel;

//    @FindBy(xpath="//span[contains(text(),'Add to story')]")
//    WebElement StoryLink;
//
//    @FindBy(xpath="//span[contains(text(),'Edit profile')]")
//    WebElement editProfileLink;

    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    public boolean verifyProfileLabel() {
        return profileLabel.isDisplayed();
    }
}
