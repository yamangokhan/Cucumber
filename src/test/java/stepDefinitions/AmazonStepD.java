package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepD {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanıcı amazon anasayfasında")
    public void kullanıcıAmazonAnasayfasında() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
    }

    @Then("kullanıcı Nutella için arama yapar")
    public void kullanıcıNutellaIçinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("nutella" + Keys.ENTER);
    }

    @And("sonucların Nutella içerdiği test eder")
    public void sonuclarınNutellaIçerdiğiTestEder() {
        String arananKelime = "nutella";
        String actualKelime = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualKelime.contains(arananKelime));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanıcı Java için arama yapar")
    public void kullanıcıJavaIçinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("java" + Keys.ENTER);
    }

    @And("sonucların Java içerdiği test eder")
    public void sonuclarınJavaIçerdiğiTestEder() {
        String arananKelime = "java";
        String actualKelime = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualKelime.contains(arananKelime));
    }

    @And("kullanıcı Iphone ıcın arama yapar")
    public void kullanıcıIphoneIcınAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Iphone" + Keys.ENTER);

    }

    @And("sonucların Iphone içerdiği test eder")
    public void sonuclarınIphoneIçerdiğiTestEder() {
        String arananKelime = "Iphone";
        String actualKelime = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualKelime.contains(arananKelime));
    }
}
