package day06_xpath_css;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XPathClassWork {


    //Go to https://the-internet.herokuapp.com/add_remove_elements/
    //Press the Add Element button
    //Test that the delete button is visible
   //press the delete key
   //Test that the "Add/Remove Elements" text is visible
   //close the page

    @Test
    void test02() throws InterruptedException {
        // https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@onclick = 'addElement()']")).click();

        //Delete butonu'nun gorunur oldugunu test edin
        Thread.sleep(3000);
        WebElement button = driver.findElement(By.xpath("//button[@onclick = 'deleteElement()']"));
        Assertions.assertTrue(button.isDisplayed());

        //Delete tusuna basin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@onclick = 'deleteElement()']")).click();

        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemove = driver.findElement(By.xpath("//h3"));
        Assertions.assertTrue(addRemove.isDisplayed());
        Thread.sleep(3000);

        //sayfayı kapatınız
        driver.quit();

    }



}
