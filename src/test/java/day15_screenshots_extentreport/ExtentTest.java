package day15_screenshots_extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities01.TestBase_01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtentTest extends TestBase_01 {

    @Test
    void test01() {


        ExtentReports extentReports;
        ExtentHtmlReporter extentHtmlReporter;
        com.aventstack.extentreports.ExtentTest extentTest;

            //Bu objecti raporlari olusturmak ve yönetmek icin kullanacağız
            extentReports = new ExtentReports();

            //Oncelikle olusturmak istedigimiz html report projemizde nerede saklamak istiyorsak bir dosya yolu olusturmaliyz
            String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(  LocalDateTime.now());
            String path ="target/extentReport/"+date+"htmlReport.html";
            extentHtmlReporter = new ExtentHtmlReporter(path);

            //ExtentsReports'a html raporlayici ekler,ve bu raporun html formatinda olusturulmasini saglar
            extentReports.attachReporter(extentHtmlReporter);

            //HTML raporun belge basligini ayarlar
            extentHtmlReporter.config().setDocumentTitle("Batch 231");

            //Raporda gösterilecek olan genel basligi ayarlar
            extentHtmlReporter.config().setReportName("My Extent Report");

            //Bu html raporunda görmek isteyebileceğimz diger bilgileri asagidaki sekilde ekleyebiliriz
            extentReports.setSystemInfo("Environment","QA");
            extentReports.setSystemInfo("Browser","Chrome");
            extentReports.setSystemInfo("Test Automation Engineer","Bilsen Pehlivanoglu");

            //AmazonTest adinda yeni bir test olusturur ve Test Steps aciklamasini ekler
            extentTest = extentReports.createTest("Amazon","Test Steps");

        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com/");
        waitForSecond(3);
        extentTest.info("Kullanıcı amazon anasayfasına gider");

        //Amazon ana sayfada oldugunuzu dogrulayin
        Assertions.assertEquals("https://www.amazon.com/",driver.getCurrentUrl());
        extentTest.info("Kullanıcı sayfa anasayfada oldugunu dogrular");
        extentTest.pass("Anasayfa URL testi basarılı");

        //Ana Sayfada cart'ın goruntulendigini dogrulayin
        WebElement cart = driver.findElement(By.id("nav-cart-text-container"));
        Assertions.assertTrue(cart.isDisplayed());
        extentTest.info("Kullanıcı anasayfadaki cart kutusunu kontrol eder");
        extentTest.pass("Kullanıcı cart kutusunun gorontulendigini dogrular");

        extentReports.flush();

    }
}
