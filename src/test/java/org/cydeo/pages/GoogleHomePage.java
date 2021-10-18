package org.cydeo.pages;

import org.cydeo.pages.WebOrderPageAllOrderPageNew;
import org.cydeo.pages.WebOrderPageAllOrderPageNew;
import org.cydeo.utility.ConfigReader;
import org.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    public GoogleHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public void goTo(){

        Driver.getDriver().get(ConfigReader.read("google_url"));
    }

    public void searchKeyword(String keyword){

        searchBox.sendKeys(keyword);
        searchButton.submit();
    }

    public boolean isAt(){
       return Driver.getDriver().getTitle().equals("Google");
    }

}
