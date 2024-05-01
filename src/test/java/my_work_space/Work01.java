package my_work_space;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Work01 {

    @Test
    void browserTest() {
// WebDriver'ı başlat
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Google'a gidin
        driver.get("https://www.google.com");

        // Arama kutusunu bulun ve "selenium" aramasını yapın
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");
        searchBox.sendKeys(Keys.RETURN);

        // Sayfa başlığını kontrol edin
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("selenium")) {
            System.out.println("Sayfa başlığı doğru: " + pageTitle);
        } else {
            System.out.println("Sayfa başlığı beklenen değil: " + pageTitle);
        }

        // İlk üç sonucu alın ve konsola yazdırın
        List<WebElement> results = driver.findElements(By.cssSelector("h3"));
        System.out.println("İlk üç sonuç:");
        for (int i = 0; i < 3; i++) {
            System.out.println(results.get(i).getText());
        }

        // WebDriver'ı kapat
        driver.quit();
    }
}
 