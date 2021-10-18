package org.cydeo.step_definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentSetDef {

    @Given("student attend all the classes")
    public void student_attend_all_the_classes() {

        System.out.println("Given code goes here");
    }
    @When("student learn all the topic")
    public void student_learn_all_the_topic() {
        System.out.println("When code goes here");
    }
    @Then("student should be ready for the job")
    public void student_should_be_ready_for_the_job() {
        System.out.println("Then code goes here");
    }

    @Given("student is prepared")
    public void student_is_prepared() {
        System.out.println("Second part of given");
    }
    @When("student upload their resume")
    public void student_upload_their_resume() {
        System.out.println("Second part of when");
    }
    @Then("student will be in the market")
    public void student_will_be_in_the_market() {
        System.out.println("Second part of then");
    }

    @Given("you are prepared for a job")
    public void you_are_prepared_for_a_job() {
        System.out.println("Condition 1");
    }
    @Given("you are in the market")
    public void you_are_in_the_market() {
        System.out.println("Condition 2");
    }
    @When("you apply for {int} jobs a day")
    public void you_apply_for_jobs(Integer applicationCount) {
       // System.out.println("Condition 3 When you are applying for "+applicationCount+" jobs");
    }
    @Then("you will eventually get the job")
    public void you_will_eventually_get_the_job() {
        System.out.println("Condition 4");
    }
}
