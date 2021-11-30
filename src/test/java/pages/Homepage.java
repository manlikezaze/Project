package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    private static final String PAGE_URL = "http://automationpractice.com/index.php";

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    private WebElement logo;

    @FindBy (xpath = "//*[@id=\"search_query_top\"]")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\"contact-link\"]/a")
    private WebElement contactUsButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"wishlist_button\"]")
    private WebElement wishlistButton;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[2]/h5/a")
    private WebElement moreButton;

    @FindBy(id = "newsletter-input")
    private WebElement newsletterField;

    @FindBy(xpath = "//*[@id=\"newsletter_block_left\"]/div/form/div/button")
    private WebElement newsletterButton;

    @FindBy(xpath = "//*[@id=\"columns\"]/p")
    private WebElement newsletterErrorMessage;

    @FindBy (xpath = "//*[@id=\"columns\"]/p")
    private WebElement newsletterSuccessMessage;

    @FindBy(xpath = "//*[@id=\"product\"]/div[2]/div/div/div/div/p")
    private WebElement wishlistErrorMessage;

    @FindBy(xpath = "//*[@id=\"product\"]/div[2]/div/div/div/div/p")
    private WebElement wishlistSuccessMessage;

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1/span")
    private WebElement searchResult;

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]")
    private WebElement searchResult2;


    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    private WebElement helpText;

    public Homepage(WebDriver driver){
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void clickHomePageLogo(){logo.click();}

    public void openSearchField(String text){ searchField.sendKeys(text);}

    public void clickSearchButton(){
        searchButton.click();
    }

    public void contactUsButton(){contactUsButton.click();}

    public void clickSignInButton(){signInButton.click();}

    public void clickWishlistButton(){wishlistButton.click();}

    public void clickMoreButton(){moreButton.click();}

    public void newsletterButton(){newsletterButton.click();}

    public String getNewsletterErrorMessageText(){return newsletterErrorMessage.getText().strip();}

    public String getNewsletterSuccessMessageText(){return newsletterSuccessMessage.getText().strip();}

    public String getWishlistErrorMessageText(){return wishlistErrorMessage.getText().strip();}

    public String getWishlistSuccessMessageText(){return wishlistSuccessMessage.getText().strip();}

    public void fillNewsLetterField(String text){newsletterField.sendKeys(text);}

    public String getSearchResultText(){return searchResult.getText().strip();}

    public String getSearchResultText2(){return searchResult2.getText().strip();}

    public String getHelpMessage() {

        try {
            return helpText.getText().strip();
        } catch (NoSuchElementException e) {
            return "";
        }
    }







}
