package day15_screenshots_extentreport;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities01.TestBase_01;

public class WebElementSreenShot extends TestBase_01 {

    //go to the Amazon page
    //Search for laptop in the search box
    //take the screenshot
    //get the image of the result text webelement




    @Test
    void test01() {

        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //Arama kutusunda laptop aratalim
        waitForSecond(3);
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("laptop", Keys.ENTER);
        //ekran resmini alalım
        screenShot();
        //sonuc yazısı webelementinin resmini alalım
        WebElement resultText = driver.findElement(By.xpath("//*[contains(text(),'results for')]"));
        screenShotOfWebElement(resultText);

    }
}
