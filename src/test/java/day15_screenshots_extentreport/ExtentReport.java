package day15_screenshots_extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtentReport {


    /*
    ExtentReport kullanabilmek icin 3 class a ihtiyacimiz var
    1) ExtentReports classindan raporlamayi baslatmasi icin object olusturmaliyiz
    2) ExtentHtmlReporter classindan raporlari html formatinda olusturmasi icin object olusturmaliyiz
    3) ExtentsTest classindan test adimlarina bilgi ekleyebilmek icin object olusturmaliyiz
     */

    ExtentReports extentReports;
    ExtentHtmlReporter extentHtmlReporter;
    ExtentTest extentTest;

    @Test
    void extentReportTemplate() {
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
        extentTest = extentReports.createTest("AmazonTest","Test Steps");

        /* ======BURAYA KADAR SABLON AYARLAMALARİ BITTI============== */

        //Testin basarili oldugunu belirtir ve PASS notu ekler
        extentTest.pass("PASS");

        //Testle iligil bilgilendirici not ekler
        extentTest.info("BILGILENDIRME NOTU");

        //Testin fail oldugunu belirtir ve FAİL MESAJİ notu ekler
        extentTest.fail("FAIL MESAJİ");

        //Testle ilgili uyari mesaji ekler
        extentTest.warning("UYARİ MESAJİ");

        //Testin atlandigini belirtir ve rapora atlama mesaji ekler
        extentTest.skip("ATLAMA MESAJİ");

        //Tum test datalarini kaydeder ve html rapor olusturur
        extentReports.flush();

    }


}
