package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EkipcoPage;
import utilities.ConfigReader;
import utilities.Driver;
import java.time.Duration;
public class EkipcoStepdefinitions {

    EkipcoPage ekipcoPage=new EkipcoPage();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

    @Given("user goes {string}")
    public void userGoes(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }


    @When("the user clicks {string} button")
    public void theUserClicksButton(String arg0) {
        ekipcoPage.contact.click();
    }
    @Then("the user clicks {string} button on the homepage")
    public void theUserClicksButtonOnTheHomepage(String arg0) {
        ekipcoPage.letsTalk.click();
        String guncelURL="https://book.ekip.co/#/customer/ekip";
        Driver.getDriver().switchTo().window(guncelURL);
    }
    @And("the user cliks {string} button")
    public void theUserCliksButton(String arg0) {
        //ReusableMethods.switchToWindow("https://book.ekip.co/#/customer/ekip");
        System.out.println(ekipcoPage.welcome.getText());
        actions.moveToElement(ekipcoPage.letsTalk2).click().perform();
        //  WebElement element=wait.until(ExpectedConditions.elementToBeClickable(ekipcoPage.letsTalk2));
    }
    @And("the user selects any month")
    public void theUserSelectsAnyMonth() {
    }
    @And("the user selects any day")
    public void theUserSelectsAnyDay() {
    }
    @And("the user selects any hour")
    public void theUserSelectsAnyHour() {
    }
    @And("the user enters valid name into name textbox")
    public void theUserEntersValidNameIntoNameTextbox() {
    }
    @And("the user enters valid email into email textbox")
    public void theUserEntersValidEmailIntoEmailTextbox() {
    }
    @And("the user enters valid phone number into phone number textbox")
    public void theUserEntersValidPhoneNumberIntoPhoneNumberTextbox() {
    }
    @And("the user verifies message on the pop-up visible")
    public void theUserVerifiesMessageOnThePopUpVisible() {
    }

}