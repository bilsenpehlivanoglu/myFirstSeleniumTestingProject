package my_work_space;

import org.apache.hc.core5.annotation.Contract;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework_02 {

    @Test
    void browserTest() {
        //Create the ChromeDriver
        //Maximize the window
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//        Go to google home page https://www.google.com/
          driver.get("https://www.google.com/");

//        cookies uyarisi cikarsa kabul ederek kapatin

//        Sayfa basliginin "Google" ifadesi icerdigini test edin
//        Verify if page title contains "Google"
        String expectedTitle="Google";
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(expectedTitle,actualTitle);

        //Arama cubuguna "Selenium" yazip aratin
        //Type "Selenium" in the searchbox and search.
          WebElement searchBox = driver.findElement(By.id("APjFqb"));
          searchBox.sendKeys("Selenium",Keys.ENTER);

        //Bulunan sonuc sayisini yazdirin
        //Print the number of results found.
        WebElement numberOfResults = driver.findElement(By.xpath("//div[@id = 'result-stats']"));
        System.out.println("Number Of Results= " + numberOfResults.getText());//About 206,000,000 results (0.40 seconds)
        System.out.println("Only Number Of Resulst = " + numberOfResults.getText().split(" ")[1]);

        //sonuc sayisinin 10 milyon'dan fazla oldugunu test edin

      /*  // Bulunan sonuçlarının sayısını yazdirin
        WebElement aboutResult = driver.findElement(By.id("result-stats"));
        String resultNumber = aboutResult.getText();
        String number = resultNumber.split(" ")[1].replace(",", "");
        Integer numberInt = Integer.parseInt(number);
        System.out.println("Bulunan arama sonucu sayisi : " + numberInt);

        // Sonuç sayısının 10 milyondan fazla olduğunu kontrol edin
        Assertions.assertTrue(numberInt > 10000000, "Bulunan sonuç sayısı 10 milyondan fazla değildir!");
        System.out.println("Bulunan sonuç sayısı 10 milyondan fazladir.");*/

        //Sayfayi kapatin
    }
}
