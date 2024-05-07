package day16_extentreport_webtables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities01.TestBase_01;

public class C01_ExtentReport extends TestBase_01 {

    //Go to Amazon page
    //Search selenium in the search box
    //Verify that the page title contains selenium


    @Test
    void test01() {
        //Amazon Title Test adinda bir test raporu olusturmak icin alt yapiyi kurduk
        createExtentReport("Amazon Title Test");

        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        extentTest.info("Kullanici Amazon sayfasina gider");
        waitForSecond(2);
        addScreenShotToReport();

        //Arama kutusunda selenium aratalim
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("selenium");
        extentTest.info("Arama kutusunda selenium yazilir");


        waitForSecond(2);
        //Sayfa basliginin selenium icerdigini doğrulayalim
        Assertions.assertTrue(driver.getTitle().contains("selenium"));
        extentTest.pass("Sayfa basliginin selenium icerdigi doğrulanir");


        extentReports.flush();
    }
}
