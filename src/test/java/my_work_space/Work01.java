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
//        Selenium WebDriver'ı kullanarak bir tarayıcıyı açın (Google Chrome, Firefox, vb.).
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//        Google ana sayfasını açın.
          driver.get("https://google.com");

//        Bir arama yapın (örneğin, "Selenium")
          WebElement search = driver.findElement(By.xpath("//textarea[@id = 'APjFqb']"));
          search.sendKeys("Selenium", Keys.ENTER);

//        Sonuçların sayfa başlığını kontrol edin ve doğru sonuçları aldığınızı doğrulayın.
          Assertions.assertTrue(driver.getTitle().contains("Selenium"));

//        İlk sayfadaki ilk üç sonucu alın ve bunları konsola yazdırın.
          WebElement firstResult = driver.findElement(By.xpath("(//h3[@class = 'LC20lb MBeuO DKV0Md'])[1]"));
          WebElement secondResult = driver.findElement(By.xpath("(//h3[@class = 'LC20lb MBeuO DKV0Md'])[6]"));
          WebElement thirdResult = driver.findElement(By.xpath("(//h3[@class = 'LC20lb MBeuO DKV0Md'])[7]"));

        //İlk sayfadaki ilk üç sonucu alın ve bunları konsola yazdırın.
        List<WebElement> results = driver.findElements(By.xpath("//h3")); //Google sonuçlarındaki sınıf adları zaman zaman değişebilir.
        // Bu yüzden daha genel bir XPath ifadesi kullandim.

        /*int i = 1;
        for (WebElement result : results) {
            if (!result.getText().isEmpty()) {
                System.out.println(i + ".Sonuc : " + result.getText());
                i++;
            }

            if (i == 4) {
                break;
            }
        }*/
        System.out.println("First Result = " + firstResult.getText());
        System.out.println("Second Result = " + secondResult.getText());
        System.out.println("Third Result = " + thirdResult.getText());

        driver.quit();

    }
}
 