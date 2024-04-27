package day08_alert;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alert {

    WebDriver driver;
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    void test1() throws InterruptedException {
        //   https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        Thread.sleep(3000);
        // birinci butona tıklayın,
       driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(3000);
       // uyarıdaki OK butonuna tıklayın
        driver.switchTo().alert().accept();

       // result mesajının  "You successfully clicked an alert" oldugunu test edin.
        String actualMessage = driver.findElement(By.id("result")).getText();
        String expectedMessage = "You successfully clicked an alert";
        Assertions.assertEquals(expectedMessage,actualMessage);
        Thread.sleep(3000);
    }

    @Test
    void test2() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        //       ikinci butona tıklayın,
        driver.findElement(By.xpath("//button[@onclick ='jsConfirm()']")).click();

        //uyarıdaki Cancel butonuna tıklayın
        driver.switchTo().alert().dismiss();

        // result mesajının "successfuly" icermedigini test edin.
        String actualMessage = driver.findElement(By.id("result")).getText();
        String unExpectedMessage = "successfuly";
        Assertions.assertFalse(actualMessage.contains(unExpectedMessage));
    }

    @Test
    void test3() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        //       ucuncu butona tıklayın,
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        //       uyarıdaki  metin kutusuna isminizi yazin,
        driver.switchTo().alert().sendKeys("Egenin arabası son model BMW");

        //       OK butonuna tıklayın
        driver.switchTo().alert().accept();

        //       result mesajında isminizin görüntülendiğini doğrulayın.
        String actualMessage = driver.findElement(By.id("result")).getText();
        Assertions.assertTrue(actualMessage.contains("Egenin arabası son model BMW"));
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
