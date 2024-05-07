package day15_screenshots_extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities01.TestBase_01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtentReportTest extends TestBase_01 {

    ExtentReports extentReports;
    ExtentHtmlReporter extentHtmlReporter;
    ExtentTest extentTest;

    @Test
    void test01() {
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
        extentTest = extentReports.createTest("Techpro Education","Test Steps");

        //TechproEducation sayfasina gidelim
        driver.get("https://techproeducation.com/");
        extentTest.info("Kullanici Techpro Education sayfasina gider");

        //TechproEducation ana sayfada oldugunuzu dogrulayin
        Assertions.assertEquals("https://techproeducation.com/",driver.getCurrentUrl());
        extentTest.info("Kullanici anasayfada oldugunu doğrular");
        extentTest.pass("Ana sayfa url testi basarili");

        //Ana Sayfada sosyal medya iconlarinin goruntulendigini dogrulayin
        WebElement icons = driver.findElement(By.xpath("//div[@class='toolbar-sl-share']"));
        Assertions.assertTrue(icons.isDisplayed());
        extentTest.info("Kullanici ana sayfadaki sosyal medya iconlarini kontrol eder");
        extentTest.pass("Kullanici iconlarin görüntülendigini doğrular");


        extentReports.flush();

    }
}
