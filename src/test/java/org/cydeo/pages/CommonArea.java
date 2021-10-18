package org.cydeo.pages;
import org.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonArea {

    @FindBy(linkText = "Logout")
    public WebElement logout;

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement viewAllOrder;

    @FindBy(xpath = "//a[.='View all products']")
    public WebElement viewAllProduct;

    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderTab;

    public CommonArea(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
