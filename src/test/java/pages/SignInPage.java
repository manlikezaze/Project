package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    private WebElement signInSubmitButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/ol/li")
    private WebElement errorMessageText;

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement topSignInButton;

    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void fillEmailField(String text){
        emailField.sendKeys(text);
    }

    public void fillPasswordField(String text){
        passwordField.sendKeys(text);
    }

    public void topSignInButton(){
        topSignInButton.click();
    }

    public void signInSubmitButton(){signInSubmitButton.click();}

    public String getErrorMessageText(){return errorMessageText.getText().strip();}
}
