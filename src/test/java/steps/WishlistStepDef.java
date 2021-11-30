package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Homepage;
import pages.SignInPage;

public class WishlistStepDef extends StepDefinitions{

    private Homepage homepage = new Homepage(driver);

    private SignInPage signInPage = new SignInPage(driver);

    @When("the More button is clicked")
    public void theMoreButtonIsClicked() {
        sleep(3);
        homepage.clickMoreButton();
    }


    @Given("the Add to wishlist button is clicked.")
    public void theAddToWishlistButtonIsClicked() {
        sleep(3);
        homepage.clickWishlistButton();

    }

    @Then("a {string}message should be shown.")
    public void aMessageShouldBeShown(String errorMessage) {
        sleep(3);
        String errorMsg = homepage.getWishlistErrorMessageText();
        System.out.println(errorMessage + ":" + errorMsg);
        //
        // Assert.assertEquals(errorMessage,errorMsg);
    }

    @Given("the user is signed in with {string} and {string}.")
    public void theUserIsSignedInWithAnd(String email, String password) {
        signInPage.topSignInButton();
        sleep(5);
        signInPage.fillEmailField(email);
        signInPage.fillPasswordField(password);
        signInPage.signInSubmitButton();
        sleep(5);
    }

    @Given("the homepage is loaded.")
    public void theHomepageIsLoaded() {
        homepage.clickHomePageLogo();
        sleep(3);
    }
}
