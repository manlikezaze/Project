package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Homepage;
import pages.SignInPage;

public class SignInStepDef extends StepDefinitions {

    private SignInPage signInPage;
    private Homepage homepage = new Homepage(driver);


    @When("the Sign In page is opened")
    public void theSignInPageIsOpened() {
        signInPage = new SignInPage(driver);
        signInPage.topSignInButton();
        sleep(5);
    }

    @Given("an {string} address is filled")
    public void anEmailAddressIsFilled(String email) {
        signInPage.fillEmailField(email);
    }

    @And("a {string} is filled")
    public void aPasswordIsFilled(String password) {
        signInPage.fillPasswordField(password);
    }

    @When("the Sign In button is clicked")
    public void theSignInButtonIsClicked() {
        signInPage.signInSubmitButton();
        sleep(5);
    }

    @Then("the {string} should be shown")
    public void theMsgShouldBeShown(String msg) {
        String errorMsg = signInPage.getErrorMessageText();
        System.out.println(msg + ":" + errorMsg);
        Assert.assertEquals(msg,errorMsg);
        sleep(5);
    }

    @Given("the homepage has opened")
    public void theHomepageHasOpened() {
        sleep(5);
        homepage.clickSignInButton();
    }

}
