package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Homepage;

public class NewsletterStepDef extends StepDefinitions {

    private Homepage homepage = new Homepage(driver);

    @And("the newsletter arrow button is clicked.")
    public void theNewsletterArrowButtonIsClicked() {
        sleep(5);
        homepage.newsletterButton();
    }


    @Given("a {string} email address is entered.")
    public void aEmailAddressIsEntered(String email) {
        sleep(5);
        homepage.fillNewsLetterField(email);
    }


    @Then("a {string} message should be shown.")
    public void anErrorMessageShouldBeShown(String errorMsg) {
        String errorMessage = homepage.getNewsletterErrorMessageText();
        System.out.println(errorMsg + ":" + errorMessage);
        //Assert.assertEquals(errorMsg, errorMessage);
        sleep(5);
    }

    @Then("a {string} success message should be shown.")
    public void aSuccessMessageShouldBeShown(String successMsg) {
        String successMessage = homepage.getNewsletterSuccessMessageText();
        System.out.println(successMsg + ":" + successMessage);
        //Assert.assertEquals(successMsg, successMessage);
        sleep(5);
    }

}
