package org.cydeo.pages;

import org.cydeo.pages.WebOrderPageAllOrderPageNew;
import org.cydeo.pages.WebOrderPageAllOrderPageNew;
import org.cydeo.utility.ConfigReader;
import org.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStory3Page {

    @FindBy(id = "prependedInput")
    public WebElement loginUsernameInputBox;

    @FindBy(id = "prependedInput2")
    public WebElement loginPasswordInputBox;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    public UserStory3Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goToAndLogin (String username, String password){
        Driver.getDriver().get(ConfigReader.read("url"));
        loginUsernameInputBox.sendKeys(username);
        loginPasswordInputBox.sendKeys(password);
        loginButton.click();
    }
}
