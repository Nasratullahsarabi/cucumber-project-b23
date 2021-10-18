package org.cydeo.pages;

import org.cydeo.pages.WebOrderPageAllOrderPageNew;
import org.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleResultPage {

    @FindBy(id = "result-stats")
    private WebElement searchResultCount;

    @FindBy(xpath = "//h3[@class='LC20lb DKV0Md']")
    private List<WebElement> resultLinks;

    public GoogleResultPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String getResultCountText(){
        return searchResultCount.getText();
    }

    public void printAllSearchResultLinks(){

        for (WebElement eachLink : resultLinks) {

            if (!eachLink.getText().equals(""))
            System.out.println("eachLink.getText() = " + eachLink.getText());
        }
    }

}
