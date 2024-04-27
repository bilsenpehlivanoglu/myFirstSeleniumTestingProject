package my_work_space;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework {

    @Test
    void browserTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //   ChromeDriver kullanarak, facebook sayfasina gidin
        driver.get("https://facebook.com");

        //   sayfa basliginin (title) "Facebook"icerdigini dogrulayin,
        Assertions.assertTrue(driver.getTitle().contains("Facebook"));

        //   Sayfa URL'inin "facebook"kelimesi icerdigini dogrulayin,
        Assertions.assertTrue(driver.getCurrentUrl().contains("facebook"));

        //   https://testcenter.techproeducation.com/ sayfasina gidin.
        driver.get("https://testcenter.techproeducation.com/");

        //   Sayfa basliginin "Automation Engineer"icerdigini dogrulayin.
        Assertions.assertTrue(driver.getTitle().contains("Automation Engineer"));

        //   Sayfa URL'inin "techproeducation"kelimesi icerdigini dogrulayin,
        Assertions.assertTrue(driver.getCurrentUrl().contains("techproeducation"));

        //   "Back to TechProEducation.com" butonunun görüntülendigini doğrulayin
        WebElement backToButton = driver.findElement(By.partialLinkText("Back to TechProEducation.com"));
        Assertions.assertTrue(backToButton.isEnabled());

        //   "Back to TechProEducation.com" butonunun üzerindeki yazinin TechProEducation icerdigini doğrulayin
        Assertions.assertTrue(backToButton.getText().contains("TechProEducation"));

        //   Tekrar "facebook"sayfasina donun
        driver.navigate().back();

        //   Geri döndüğünüzü doğrulayin.
        Assertions.assertTrue(driver.getCurrentUrl().contains("https://www.facebook.com/"));

        //   Sayfayi kapatin
        driver.quit();

    }
}






