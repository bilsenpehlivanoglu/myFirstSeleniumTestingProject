package my_work_space;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities01.TestBase_01;

import java.util.List;

public class New_Homework extends TestBase_01 {





       //    ==========Homework 3===========================
//  - ebay sayfasına gidiniz
//- electronics bölümüne tıklayınız
//- Genişliği 225 ve Uzunluğu 225 olan resimlerin hepsine tıklayalım
//- Her sayfanın sayfa başlığını yazdıralım
       @Test
       void hm03() {


// - ebay sayfasına gidiniz
           driver.get("https://ebay.com");

//- electronics bölümüne tıklayınız
           driver.findElement(By.linkText("Electronics")).click();

//- Genişliği 225 ve Uzunluğu 225 olan resimlerin hepsine tıklayalım
// - Her sayfanın sayfa başlığını yazdıralım
           List<WebElement> imgs = driver.findElements(By.cssSelector("img[width='225'][height='225']"));
           int n = 1;
           for (int i = 0; i < imgs.size(); i++) {
               imgs = driver.findElements(By.cssSelector("img[width='225'][height='225']")); // Resimleri yeniden bul
               WebElement w = imgs.get(i);
               w.click();
               System.out.println(n + ". resim başlığı= " + "'" + driver.getTitle() + "'");
               driver.navigate().back();
               n++;
           }

       }
    @Test
    void hm04() {
        //==========Homework 4===========================
//    https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
//    Add Element butonuna basin 100 kez basınız
//    Delete butonuna 90 kez basınız
//    Ve 90 kez basıldığını doğrulayınız

        // https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // Add Element butonuna basin 100 kez basınız
        int countPlus = 0;
        for (int i = 0; i < 100; i++) {
            driver.findElement(By.xpath("//*[.='Add Element']")).click();
            countPlus++;
        }

        // Delete butonuna 90 kez basınız
        int countMinus = 0;
        for (int i = 0; i < 90; i++) {
            driver.findElement(By.xpath("(//button[@onclick='deleteElement()'])[1]")).click();
            countMinus++;
        }

        // Ve 90 kez basıldığını doğrulayınız
        Assertions.assertTrue(countMinus == 90);

    }



}
