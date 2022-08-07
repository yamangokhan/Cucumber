package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class EkipcoPage {
    public EkipcoPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//span[contains(text(),'Contact')]")
    public WebElement contact;
    @FindBy(xpath="(//span)[21]")
    public WebElement letsTalk;
    @FindBy(xpath="//div[@class='dis-flex zb-default-service-list ']")
    public WebElement letsTalk2;
    @FindBy(xpath="//span[@class='dis-block text-center zb-default-title']")
    public WebElement welcome;
}