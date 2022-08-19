package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Senario3_BillPayment {
    DialogContent dc=new DialogContent();
    @And("Navigate to Bill pay page")
    public void navigateToBillPayPage() {
        dc.findAndClick("billpayButton");
    }

    @When("Enter payee name as {string} and money as {string}")
    public void enterPayeeNameAsAndMoneyAs(String arg0, String arg1) {
        dc.findAndSend("payeeName",arg0);
        dc.findAndSend("payeeAddress","taksim");
        dc.findAndSend("payeecity","istanbul");
        dc.findAndSend("payeestate","taksim");
        dc.findAndSend("payeezipCode","23232");
        dc.findAndSend("payeePhone","55555");
        dc.findAndSend("payeeAccount","21");
        dc.findAndSend("payeeVerifyAccount","21");
        dc.findAndSend("payeeAmount",arg1);
        dc.findAndClick("payeePayment");
    }
    @Then("User should pay successfully")
    public void userShouldPaySuccessfully() {
        dc.findAndContainsText("paymentVerify","Complete");
    }

}
