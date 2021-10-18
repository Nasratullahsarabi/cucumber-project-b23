package org.cydeo.step_definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cydeo.pages.WLoginPage;
import org.cydeo.utility.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WebOrderLoginStepDef {

    WLoginPage loginPage = new WLoginPage();

    @Given("we are at web order login page")
    public void we_are_at_web_order_login_page() {

        loginPage.goTo();
    }
    @When("we provide valid credential")
    public void we_provide_valid_credential() {

        loginPage.login("Tester", "test");

    }
    @Then("we should see all order page")
    public void we_should_see_all_order_page() {

        assertEquals("Web Orders", Driver.getDriver().getTitle());

    }

    @When("we provide invalid credentials")
    public void weProvideInvalidCredentials() {
        loginPage.login("blabla","blabla");
    }

    @Then("we should still be at login page")
    public void weShouldStillBeAtLoginPage() {
        assertEquals("Web Orders Login", Driver.getDriver().getTitle());
    }

    @And("login error message should be present")
    public void loginErrorMessageShouldBePresent() {

        assertTrue(loginPage.loginErrorMsgPresent());
    }

    @When("user provides username {string} and password {string}")
    public void userProvidesUsernameAndPassword(String username, String password) {

        loginPage.login(username, password);
    }
}
