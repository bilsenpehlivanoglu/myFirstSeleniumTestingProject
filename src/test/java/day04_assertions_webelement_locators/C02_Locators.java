package day04_assertions_webelement_locators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Locators {

    //Go to Amazon page
    //Locate the search box and print and search for iPhone
    //close the page

/*
    @Test
    void locatorsTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone",Keys.ENTER);

       driver.quit();
    }*/

    WebDriver driver;
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    void locators() throws InterruptedException {
//    When user goes to: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//    And enter username
      driver.findElement(By.name("username")).sendKeys("Admin");

//    And enter password
        driver.findElement(By.name("password")).sendKeys("admin123");

//    And click on submit button
      driver.findElement(By.tagName("button")).click();

//    Then verify the login is successful
        Thread.sleep(5000);
        //NOTE: that ONE OF THE BELOW ASSERTIONS İS ENOUGH
        Assertions.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        Assertions.assertFalse(driver.getCurrentUrl().contains("auth"));
        Assertions.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
        /*
       1. using URL
          https://opensource-demo.orangehrmlive.com/web/index.php/auth/login //before login
          https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index //after login
      If login is successful then current URL should contain dashboard OR
      If login is successful then current URL should NOT contain auth

      2. ALTERNATIVELY
      We can locate the profile element(or any other unique element on that page)
      And check if that element is displayed using isDisplayed()method
      */

//    Then logout the application >click on the profile > click on logout
        driver.findElement(By.className("oxd-userdropdown-name")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Logout")).click();//LinkText accepts exact match
        Thread.sleep(3000);
        //driver.findElement(By.partialLinkText("Log")).click();//partialLinkText accepts substring or exact math

//    Then verify the logout is successful
        /*
        if logout is succesful then current url should contain auth keyword
        */
        Assertions.assertTrue(driver.getCurrentUrl().contains("auth"));

   }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
