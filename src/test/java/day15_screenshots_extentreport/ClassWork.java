package day15_screenshots_extentreport;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utilities01.TestBase_01;

public class ClassWork extends TestBase_01 {


//Go to Techproeducation page
//Verify that the home page has loaded successfully.
//Take a screenshot of the page
//Verify that the phone number displayed on the page is +1 585 304 29 59
//take a screenshot of the displayed phone number
//print selenium in search box and take screenshot of search box


    @Test
    void test01() {
        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");
        //Ana sayfanın başarıyla yüklendiğini doğrula.
        Assertions.assertEquals("https://techproeducation.com/",driver.getCurrentUrl());

        //Sayfanın ekran görüntüsünü alin
        //Sayfada görüntülenen telefon numarasinin +1 585 304 29 59 oldugunu dogrulayin
        //goruntulenen telefon numarasinin ekran goruntusunu alin
        //arama kutusunda selenium yazdirin ve arama kutusunun ekran goruntusunu alin



    }
}
