package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactusPage {
    @FindBy(id = "message")
    private WebElement messageField;

    @FindBy(xpath = "//*[@id=\"id_contact\"]")
    private WebElement subjectHeadingSelect;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "id_order")
    private WebElement orderRefField;

    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/ol/li")
    private WebElement errorText;

    @FindBy(className = "alert-success")
    private WebElement successText;

    public ContactusPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void fillMessageFieldWith(String text){ messageField.sendKeys(text);}

    public void selectSubjectHeading(String subjectHeading){
        Select dropdown = new Select(subjectHeadingSelect);
        dropdown.selectByVisibleText(subjectHeading);
    }

    public void fillEmailFieldWith(String text){ emailField.sendKeys(text); }

    public void fillOrderRefWith(String text){ orderRefField.sendKeys(text); }

    public void clickSendButton(){ sendButton.click(); }

    public String getErrorText(){return errorText.getText().strip();}

    public String getSuccessText(){return successText.getText().strip();}


}
