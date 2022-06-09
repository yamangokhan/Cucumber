package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class guruStepD {

    GuruPage guruPage = new GuruPage();

    @And("kullanıcı {string} sutunundaki tum degerleri yazdirir")
    public void kullanıcıSutunundakiTumDegerleriYazdirir(String istenensutun) {
        List<WebElement> tabloBaslkListesi = guruPage.baslıkListesi;
        //listemiz WebElementlerden olusuyor
        // dolasıyla bu Webelementleden hangisi istenen sutun başlıgını tasıyor bilemeyiz
        int istenenBaslıkIndexi = -3; // indextekinin nearif olma ihitmali yok, eger bulduysa -3 değildir.
        for (int i = 0; i < tabloBaslkListesi.size(); i++) {
            if (tabloBaslkListesi.get(i).getText().equals(istenensutun)) {
                istenenBaslıkIndexi = i+1;
                break;
            }

        }

        // for loop ile tüm sutun baslıklarını bana verilen istenen sutun değeri ile karşılastırdım
        // loop bittiğinde baslıgın bulunup bulunmadıgını kontrol etmek ve
        // bulundu ise yoluma devam etmek istiyorum

        if (istenenBaslıkIndexi != -3) { // -3 e eşit değilse baslık bulundu.
            List<WebElement> istenenSutundakiElementler = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + istenenBaslıkIndexi + "]"));
            for (WebElement each : istenenSutundakiElementler) {
                System.out.println(each.getText());
            }

        } else { // baslık bulunamadı ise;
            System.out.println("istenen baslık bulunmadı");
        }

    }
}
