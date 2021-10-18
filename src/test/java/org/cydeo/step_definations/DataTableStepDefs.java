package org.cydeo.step_definations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cydeo.pages.WLoginPage;

import java.util.List;
import java.util.Map;

public class DataTableStepDefs {

    @Given("I have a {string}")

    public void i_have_a(String animal) {
        System.out.println("Given I have a "+animal);
    }

    @When("I call their names")
    public void i_call_their_names() {
        System.out.println("When I call their names");
    }

    @Then("They come to me.")
    public void they_come_to_me() {
        System.out.println("They come to me");
    }

    @Given("I have following animals")
    public void i_have_following_animals(List<String> animalList) {
        System.out.println("animalList="+animalList);
    }

    @When("I call their names with below names")
    public void iCallTheirNamesWithBelowNames(List<String> nameLst) {

        System.out.println("nameLst = " + nameLst);

    }

    @Then("They come to me with below noise")
    public void theyComeToMeWithBelowNoise(Map<String, String> animalNoiseMap) {

        System.out.println("animalNoiseMap = " + animalNoiseMap);

    }

    @Then("we provide bellow credentials")
    public void weProvideBellowCredentials(Map<String, String> credentialMap) {

        String usernameFromTable = credentialMap.get("username");
        String passwordFromTable = credentialMap.get("password");
        WLoginPage loginPage = new WLoginPage();
        //loginPage.goTo();
        loginPage.login(usernameFromTable,passwordFromTable);


    }

    @Given("this is the product reference")
    public void thisIsTheProductReference(List<Map<String, Object>> productMapList) {

//        System.out.println(productMapList);
//
//        for (Map<String, Object> eachRowMap : productMapList){
//            System.out.println("eachRowMap = " + eachRowMap);
//        }

//        Map<String, Object> firstRowMap = productMapList.get(0);
//        System.out.println("firstRowMap = " + firstRowMap);
//        System.out.println("firstRowMap.get(\"Price\") = " + firstRowMap.get("Price"));
//        System.out.println("firstRowMap.get(\"Discount\") = " + firstRowMap.get("Discount"));
//        System.out.println("firstRowMap.get(\"Product\") = " + firstRowMap.get("Product"));
//        Map<String, Object> secondRoaMap = productMapList.get(1);
//        System.out.println("secondRoaMap.get(\"Product\") = " + secondRoaMap.get("Product"));
//        System.out.println("secondRoaMap.get(\"Price\") = " + secondRoaMap.get("Price"));
//        System.out.println("secondRoaMap.get(\"Discount\") = " + secondRoaMap.get("Discount"));
//        System.out.println("secondRoaMap = " + secondRoaMap);
//        Map<String, Object> thirdRowMap = productMapList.get(2);
//        System.out.println("thirdRowMap.get(\"Product\") = " + thirdRowMap.get("Product"));
//        System.out.println("thirdRowMap.get(\"Price\") = " + thirdRowMap.get("Price"));
//        System.out.println("thirdRowMap.get(\"Discount\") = " + thirdRowMap.get("Discount"));
//        System.out.println("thirdRowMap = " + thirdRowMap);
//        System.out.println("------------------------------------------------------------------------");
//        System.out.println("productMapList.get(1).get(\"Price\") = " + productMapList.get(1).get("Price"));
//        System.out.println("price: " + productMapList.get(1).get("Price") +", Discount: "+ productMapList.get(1).get("Discount"));

    }

    @And("I have another product reference without header")
    public void headlessTable(List<List<String>> productInfoList) {

        System.out.println("productInfoList = " + productInfoList);
        System.out.println("productInfoList.get(2).get(0) = " + productInfoList.get(0));
        System.out.println("productInfoList.get(1) = " + productInfoList.get(1));
        System.out.println("productInfoList.get(2) = " + productInfoList.get(2));
        System.out.println("----------------------------------------------------------");
        System.out.println("productInfoList.get(0).get(0) = " + productInfoList.get(0).get(0));
        System.out.println("productInfoList.get(1).get(2) = " + productInfoList.get(1).get(2));
        List<String> thirdRow = productInfoList.get(2);
        System.out.println("thirdRow.get(2) = " + thirdRow.get(2));
    }
}
