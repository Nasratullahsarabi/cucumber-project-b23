package org.cydeo.step_definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;

public class EatStepDef {

    @Given("John is hungry")
    public void john_is_hungry() {

        System.out.println("This is @Given code John_is_hungry");
    }

    @When("He eats {int} cucumbers")
    public void he_eats_cucumbers(Integer int1) {

        System.out.println("This is @When code he_eats_cucumber");
    }

    @Then("He will be full")
    public void he_will_be_full() {

        System.out.println("This is @Then code he_will_be_full");

    }

    @Given("Ivan is hungry")
    public void ivan_is_hungry() {
        System.out.println("@Givin Ivan is hungry");
    }
    @When("He eats {int} cucumber")
    public void he_eats_cucumber(Integer int1) {
        System.out.println("@When Ivan is hungry");

    }
    @Then("He faints")
    public void he_faints() {
        System.out.println("@Then he faints");

    }

    @Given("there are {int} cucumbers")
    public void there_are_cucumbers(Integer startCount) {

        System.out.println("startCount = " + startCount);
    }

    @When("I eat {int} cucumbers")
    public void i_eat_cucumbers(Integer eatCount) {
        System.out.println("eatCount = " + eatCount);
    }

    @Then("I should have {int} cucumbers")
    public void i_should_have_cucumbers(Integer leftCount) {
        System.out.println("leftCount = " + leftCount);
    }
}
