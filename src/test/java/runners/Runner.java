package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "src/test/java/stepDefinitions",
        tags = "@wip",
        dryRun = false
)

public class Runner {
    /*
    Bir framework de bir tek Runner Class'ı yeterli olabilir. Runner Classindan class içerisinde (bodysinde) hiç bir şey olmaz
       Runner class ımızı runner yapan onemli 2 adet annotation vardır.

      @ @RunWith(Cucumber.class) notasyonu Runner classına calısma özelliği katar . Bu notasyon olduğu için Cucumber Framework umuzde
      kullanmayı tercih ediyoruz.

        features : Runner dosyasinin feature dosyalarini nereden bulacafgini tarif eder
        glue : step definitions dosyalarini nerede bulacagmizi gosterir
        tag : o an hangi tag'i calistirmak istiyorsak onu belli eder

        dryRun : iki secenek var
    dryRun=true; yazdigimizda testimiz calistirmadan sadece eksik adimlari bize verir
    dryRun=false;yazdıgımızda testlerimizi çalıştırır.
     */


}
