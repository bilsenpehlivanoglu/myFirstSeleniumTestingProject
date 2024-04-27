package day05_webelements_locators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ClassWork {

    //Go to https://testcenter.techproeducation.com/index.php
    //Test whether the "Back to TechProEducation.com" button is enabled for user access
    // Test whether the "Applications lists" title is visible by locating it with the tagname

    @Test
    void applicationTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //https://testcenter.techproeducation.com/index.php adresine gidin
        driver.get("https://testcenter.techproeducation.com/index.php");

        // "Back to TechProEducation.com" butonunun kullanici erisimi icin etkin olup olmadigini test edin
       WebElement backToButton = driver.findElement(By.partialLinkText("Back to TechProEducation.com"));
        Assertions.assertTrue(backToButton.isEnabled());

        // "Applications lists" basligini tagname ile locate ederek görünür  olup olmadigini test ediniz
        WebElement appList= driver.findElement(By.tagName("h1"));
        Assertions.assertTrue(appList.isDisplayed());

        driver.quit();
    }




}
