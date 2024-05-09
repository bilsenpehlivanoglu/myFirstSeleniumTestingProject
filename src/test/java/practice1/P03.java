package practice1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities01.TestBase_01;

import java.time.Duration;

public class P03 extends TestBase_01 {

    //Go to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
    //Click me, to open an ... button
    //Close the resulting alert


    @Test
    void test01() {

        //https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver sayfasına gidelim
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        //Click me, to open an ... butonuna basalım
        WebElement clickMe = driver.findElement(By.cssSelector("#alert"));
        clickMe.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        //Çıkan alert'i kapatalım
        driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

    }
}
