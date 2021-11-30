package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactusPage;
import pages.Homepage;

public class ContactUsStepDef extends StepDefinitions {

    private ContactusPage contactusPage = new ContactusPage(driver);
    private Homepage homepage = new Homepage(driver);

    @When("the contactus button is clicked.")
    public void theContactusButtonIsClicked() {
        homepage.contactUsButton();
        sleep(5);
    }


    @Then("the {string} subject heading is selected")
    public void theSubjectHeadingIsSelected(String subjectHeading) {
        contactusPage.selectSubjectHeading(subjectHeading);
    }


    @And("the email field is filled with {string}")
    public void theEmailFieldIsFilledWith(String email) {
        contactusPage.fillEmailFieldWith(email);
    }


    @And("the order reference field is filled with {string}")
    public void theOrderReferenceFieldIsFilledWith(String order) {
        contactusPage.fillOrderRefWith(order);
    }

    @And("the message field is filled with {string}")
    public void theMessageFieldIsFilledWith(String msg) {
        contactusPage.fillMessageFieldWith(msg);
    }

    @When("the Send button is clicked")
    public void theSendButtonIsClicked() {
        contactusPage.clickSendButton();
        sleep(5);
    }


    @Then("a {string} success message should be shown")
    public void aSuccessMessageShouldBeShown(String successMessage) {
        String successText = contactusPage.getSuccessText();
        System.out.println(successMessage + ":" + successText);
        Assert.assertEquals(successMessage,successText);
        sleep(5);
    }


    @Then("a {string} error message should be shown")
    public void aErrorMessageShouldBeShown(String errorMessage) {
        String errorText = contactusPage.getErrorText();
        System.out.println(errorMessage + ":" + errorText);
        Assert.assertEquals(errorMessage,errorText);
        sleep(5);
    }


    @Given("the homepage is opened.")
    public void theHomepageIsOpened() {
        homepage.contactUsButton();
    }
}
