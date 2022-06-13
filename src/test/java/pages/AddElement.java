package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddElement {
    public AddElement() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[contains(text(),'Add Element')]")
    public WebElement addElementButton;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    public WebElement deleteButton;

    @FindBy (xpath = "")
    WebElement xyz;

}
