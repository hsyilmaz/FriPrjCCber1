package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Senario1_CreateAccount {
    DialogContent dc=new DialogContent();
    @Given("Navigate to parabank")
    public void navigateToParabank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Click register button and create account")
    public void clickRegisterButtonAndCreateAccount() {
        dc.findAndClick("registerbtnHome");
        dc.findAndSend("firstname","GRUPOP21");
        dc.findAndSend("lastname","grupop");
        dc.findAndSend("addresStreet","kadıköy");
        dc.findAndSend("addressCity","istanbul");
        dc.findAndSend("addressState","kadıköy");
        dc.findAndSend("addressZipCode","22222");
        dc.findAndSend("phoneNumber","5555555");
        dc.findAndSend("ssn","5555555");
        dc.findAndSend("registerUsername","GRUPOP21");
        dc.findAndSend("registerPassword","grupop");
        dc.findAndSend("registerRepeatedPassword","grupop");
        dc.findAndClick("registerButton");
    }

    @Then("User should create account successfully")
    public void userShouldCreateAccountSuccessfully() {
        dc.findAndContainsText("registerValidate","success");
    }
}
