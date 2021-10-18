package org.cydeo.step_definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatoreStepDef {

    int actualResult;
    @Given("calculator app is open")
    public void calculator_app_is_open() {

        System.out.println("@Given cod calculator app is open");

    }
    @When("I add {int} with {int}")
    public void i_add_with(Integer num1, Integer num2) {

        System.out.println("@When cod when I add "+num1+" "+num2);

        actualResult = num1+num2;
    }
    @Then("I should get result {int} displayed")
    public void i_should_get_result_displayed(int expectedResult) {

        System.out.println("@Then cod Then result should be: "+expectedResult);

        Assert.assertEquals(expectedResult,actualResult);

    }
}
