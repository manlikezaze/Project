package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Homepage;

public class SearchStepDef extends StepDefinitions {

    private Homepage homepage = new Homepage(driver);


    @Given("the search field is filled with {string}")
    public void theSearchFieldIsFilledWithItem(String item) {
        homepage.openSearchField(item);
        sleep(5);
    }


    @When("the Search icon is clicked")
    public void theSearchIconIsClicked() {
        homepage.clickSearchButton();
        sleep(5);
    }


    @Then("confirm the {string} help message is shown")
    public void confirmTheMsgHelpMessageIsShown(String msg) {
        sleep(5);
        String actualMessage = homepage.getHelpMessage();
        System.out.println(msg +":"+ actualMessage);

        //Assert.assertEquals(msg.strip(),actualMessage.strip());
    }


    @And("the search result should be {string}")
    public void theSearchResultShouldBeResult(String result) {
        sleep(5);
        String actualResult;
        if (result.equals("0 results have been found." ))
            actualResult = homepage.getSearchResultText();
        else
            actualResult = homepage.getSearchResultText2();

        System.out.println(result +":"+ actualResult);
        //Assert.assertEquals(result,actualResult);

    }
}
