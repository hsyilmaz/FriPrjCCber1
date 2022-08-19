package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Senario2_LoginVerify {
    DialogContent dc=new DialogContent();

    @When("Enter username {string} and password {string} to log in")
    public void enterUsernameAndPasswordToLogIn(String username, String password) {
          dc.findAndSend("username", username);
          dc.findAndSend("password", password);
          dc.findAndClick("loginButton");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.findAndContainsText("loginVerify","Accounts");
    }

    @When("Enter invalid username {string} and password {string} to log in")
    public void enterInvalidUsernameAndPasswordToLogIn(String username, String password) {
        dc.findAndSend("username", username);
        dc.findAndSend("password", password);
        dc.findAndClick("loginButton");
    }

    @Then("User should not login")
    public void userShouldLoginUnsuccessfully() {
        dc.findAndContainsText("loginUnVerify","error");
    }

}
