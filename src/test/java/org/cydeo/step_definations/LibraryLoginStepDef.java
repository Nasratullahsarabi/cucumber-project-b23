package org.cydeo.step_definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cydeo.pages.LibLoginPage;
import org.cydeo.utility.BrowserUtil;
import org.cydeo.utility.Driver;
import org.junit.Assert;

public class LibraryLoginStepDef {

    LibLoginPage navigate = new LibLoginPage();

    @Given("user is at library login page")
    public void userIsAtLibraryLoginPage() {


        navigate.goTo();
    }

    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String email, String password) {
        navigate.login(email,password);
    }


    @Then("user should be at dashboard page")
    public void userShouldBeAtDashboardPage() {
        BrowserUtil.waitFor(1);

        Assert.assertEquals("Library", Driver.getDriver().getTitle());
    }


}
