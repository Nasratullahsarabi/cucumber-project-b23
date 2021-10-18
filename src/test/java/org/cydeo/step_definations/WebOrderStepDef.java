package org.cydeo.step_definations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cydeo.pages.CommonArea;
import org.cydeo.pages.WAllProductPage;
import org.cydeo.pages.WCommonArea;
import org.cydeo.pages.WOrderPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class WebOrderStepDef {
    @When("we select {string} tab from sidebar")
    public void weSelectTabFromSidebar(String tabName) {

        WCommonArea commonArea = new WCommonArea();
        switch (tabName){
            case "View all products":
                commonArea.viewAllProductTab.click();
                break;
            case "View all orders":
                commonArea.viewAllOrderTab.click();
                break;
            case "Order":
                commonArea.orderTab.click();
                break;

        }

    }

    @Then("we should see bellow options in product dropdown list")
    public void weShouldSeeBellowOptionsInProductDropdownList(List<String> expectedOptions) {

        System.out.println("expectedOptions = " + expectedOptions);

        WOrderPage orderPage = new WOrderPage();
        List<String> actualOptions = orderPage.getAllProductOptionFromList();

        Assert.assertEquals(expectedOptions,actualOptions);
    }

    @Then("we should see table with below content")
    public void weShouldSeeTableWithBelowContent(List<Map<String, String>> productMapList) {

        WAllProductPage allProductPage = new WAllProductPage();

//        Set<String> headerSet = productMapList.get(0).keySet();
//        System.out.println("headerSet = " + headerSet);
//
//        List<String> actualHeaders = allProductPage.getAllHeaderText();
//        System.out.println("actualHeaders = " + actualHeaders);
//
//        Assert.assertEquals(headerSet.size(),actualHeaders.size());
//
//        List<String> expectedHeaders = new ArrayList<>(headerSet);
//
//        Assert.assertEquals(expectedHeaders,actualHeaders);

        System.out.println("allProductPage.getRowMapFromWebTable() = " + allProductPage.getRowMapFromWebTable());

        Map<String, String> expectedFirstRowMap = productMapList.get(0);
        Map<String, String> actualFirstRowMap = allProductPage.getRowMapFromWebTable();

        Assert.assertEquals(expectedFirstRowMap, actualFirstRowMap);


    }
}
