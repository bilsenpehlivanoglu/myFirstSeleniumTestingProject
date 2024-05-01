package day11_actions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities01.TestBase_01;

public class C05_Actions extends TestBase_01 {

    @Test
    void test01() {

// Google anasayfasına gidelim
        driver.get("https://google.com");
// arama kutusunda shift tusuna basılı olarak selenium yazdıralım ve shift tuşunu serbest bırakarak java  yazdıralım
        Actions actions = new Actions(driver);
        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        actions.keyDown(searchBox,Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).perform();
        /*actions.keyDown(searchBox, Keys.SHIFT)//arama kutusunda shift tuşuna basılı tutar
                .sendKeys("selenium")//shift tuşuna basılı tutarak selenium yazar
                .keyUp(Keys.SHIFT)//shift tuşundan elini kaldırır
                .sendKeys("  - java",Keys.ENTER).perform();*/
    }
    @Test
    void test02Yol() {

// Google anasayfasına gidelim
// arama kutusunda shift tusuna basılı olarak selenium yazdıralım ve shift tuşunu serbest bırakarak java yazdıralım

    }
}
