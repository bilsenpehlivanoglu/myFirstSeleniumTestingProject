package my_work_space;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities01.TestBase_01;

public class Hw_01 extends TestBase_01 {

    @Test
    void alertTest() {
        //    ==========Homework 1===========================
//  -http://demo.automationtesting.in/Alerts.html sayfasına gidiniz
        driver.get("http://demo.automationtesting.in/Alerts.html");

//  -Alert with OK karşısındaki click the button to display an alert box: butonuna tıklayınız
     driver.findElement(By.xpath("//button[@onclick ='alertbox()']")).click();

//-Çıkan alert üzerindeki yazıyı konsola yazdırınız ve tamam butonuna basınız
        System.out.println("Visible Message = " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

//-Alert with OK & Cancel butonuna basınız ve sonrasında click the button to display a confirm box butonuna basınız
       driver.findElement(By.xpath("//a[@class='analystic']")).click();
       driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();

//-Çıkan alert'te iptal butonuna basınız
        driver.switchTo().alert().dismiss();

// -Alert with Textbox butonuna basınız ve sonrasında click the button to demonstrate the prompt box butonuna basınız
        driver.findElement(By.partialLinkText("Alert with Textbox")).click();
        driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();

//-Çıkan prompt box'a 'isminizi' yazdırınız ve Tamam'a basınız
        driver.switchTo().alert().sendKeys("Lucky");
        driver.switchTo().alert().accept();

//-Çıkan mesajı konsola yazdırınız
        String visibleMessage = driver.findElement(By.id("demo1")).getText();
        System.out.println("visibleMessage = " + visibleMessage);

//-Çıkan mesajın 'Hello <isminiz> How are you today' yazdığını doğrulayınız
        Assertions.assertTrue(visibleMessage.contains("Hello Lucky How are you today"));
    }
}
