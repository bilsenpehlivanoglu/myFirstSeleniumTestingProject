package day06_xpath_css;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButton {

    // Go to https://www.facebook.com
    //Click the "Create an Account" button
    //locate "radio buttons" elements
    // If it is not selected, choose the one that suits you from the gender button.

    @Test
    void test04() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //  https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com");

        //  "Create an Account" button'una basin
        WebElement createAccount = driver.findElement(By.xpath("(//a[@role = 'button'])[2]"));
        createAccount.click();

        //  "radio buttons" elementlerini locate edin
        Thread.sleep(2000);
        WebElement female = driver.findElement(By.xpath("//input[@value = '1']"));
        WebElement male = driver.findElement(By.xpath("//input[@value = '2']"));

        //  Secili degilse cinsiyet butonundan size uygun olani secin
        if (!female.isSelected()){
            female.click();
        }
        Thread.sleep(2000);
        driver.quit();


    }



}
