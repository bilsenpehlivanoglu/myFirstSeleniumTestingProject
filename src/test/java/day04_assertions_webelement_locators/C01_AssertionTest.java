package day04_assertions_webelement_locators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_AssertionTest {

    // Go to Google Website
    //Verify that the page title is Google
    // Close the page

    // Go to Google Website
    // Verify that the page url is https://www.google.com/
    // Close the page


    // Google Web sitesine gidin
    // Sayfa basliginin Google oldugunu dogrulayin
    // Sayfayi kapatin


    // Google Web sitesine gidin
    // Sayfa url nin https://www.google.com/ oldugunu dogrulayin
    // Sayfayi kapatin




    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com/");
    }

    @Test
    void pageTitle() {
        String expextedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(expextedTitle,actualTitle);
    }

    @Test
    void pageUrl() {
        String expectedUrl ="https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl,actualUrl);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}

