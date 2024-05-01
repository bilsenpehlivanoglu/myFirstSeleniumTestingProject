package day11_actions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities01.TestBase_01;

public class C03_Actions extends TestBase_01 {

    @Test
    void test01() {

        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");
        //Sayfayı istediğimiz bir miktar aşağıya doğru scroll yapalım
        Actions actions = new Actions(driver);
        for (int i = 0; i < 3; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
        }

        //Sayfayı istediğimiz bir miktar yukarıya doğru scroll yapalım
        for (int i = 0; i < 3; i++) {
            actions.sendKeys(Keys.PAGE_UP).perform();
        }

         //sendKeys(Keys.PAGE_DOWN)=>aşağı kaydırır
         //sendKeys(Keys.PAGE_UP)=>yukarı kaydırır

    }

    @Test
    void test02() {
        driver.get("https://techproeducation.com");
        Actions actions = new Actions(driver);
        //Sayfanın en altına scroll yapalım
        actions.sendKeys(Keys.END).perform();
        //Sayfanın en üstüne scroll yapalım
        actions.sendKeys(Keys.HOME).perform();
        //sendKeys(Keys.PAGE_END)=>en sona iner
        //sendKeys(Keys.PAGE_HOME)=>en yukarı çıkar
    }

    @Test
    void test03() {
        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");
        Actions actions = new Actions(driver);
        //Events yazısına kadar scroll yapalım
        WebElement write = driver.findElement(By.xpath("//h2[@class ='react__tittle']"));
        actions.scrollToElement(write).perform();
        //scrollToElement(locate al)=>
    }
}
