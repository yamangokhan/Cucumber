package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.dataTable;
import utilities.ConfigReader;
import utilities.Driver;

public class dataTableStepD {

    dataTable dtable = new dataTable();


    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dtable.newButonu.click();
    }


    @And("kullanıcı isim bölümüne {string} bilgisi girer")
    public void kullanıcıIsimBölümüneBilgisiGirer(String firstname) {
        dtable.firstName.sendKeys(firstname);
    }

    @And("kullanıcı soyisim bölümüne {string} bilgisi girer")
    public void kullanıcıSoyisimBölümüneBilgisiGirer(String lastname) {
        dtable.lastName.sendKeys(lastname);
    }

    @And("kullanıcı position bölümüne {string} bilgisi girer")
    public void kullanıcıPositionBölümüneBilgisiGirer(String position) {
        dtable.position.sendKeys(position);
    }

    @And("kullanıcı office bölümüne  {string} bilgisi girer")
    public void kullanıcıOfficeBölümüneBilgisiGirer(String office) {
        dtable.office.sendKeys(office);
    }

    @And("kullanıcı extn bölümüne {string} bilgisi girer")
    public void kullanıcıExtnBölümüneBilgisiGirer(String extension) {
        dtable.extn.sendKeys(extension);
    }

    @And("kullanıcı start date bölümüne {string} bilgisi girer")
    public void kullanıcıStartDateBölümüneBilgisiGirer(String startdate) {
        dtable.startDate.sendKeys(startdate);
    }

    @And("kullanıcı salary bölümüne {string} bilgisi girer")
    public void kullanıcıSalaryBölümüneBilgisiGirer(String salary) {
        dtable.salary.sendKeys(salary);
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        dtable.create.click();

    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dtable.search.sendKeys(firstname);
    }

    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstname) {
        Assert.assertTrue(dtable.aramaSonucIlkElement.getText().contains(firstname));
    }


}
