package org.cydeo.step_definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cydeo.pages.GoogleHomePage;
import org.cydeo.utility.Driver;
import org.junit.Assert;

public class GoogleSearchStepDef {

    GoogleHomePage homePage = new GoogleHomePage();

    @Given("user is at home page")
    public void user_is_at_home_page() {
        homePage.goTo();
    }
    @When("user searches for keyword {string}")
    public void user_searches_for_keyword(String keyword) {
        homePage.searchKeyword(keyword);
    }
    @Then("user should see result page")
    public void user_should_see_result_page() {
        System.out.println("I can check the title in next method");

    }
    @Then("the title should start with {string}")
    public void the_title_should_start_with(String keyword) {

        Assert.assertTrue(Driver.getDriver().getTitle().startsWith(keyword));
    }
}
