package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities01.TestBase_01;

import java.util.Set;

public class WindowHandles extends TestBase_01 {

    // Go to https://the-internet.herokuapp.com/windows.
//get the Handle value of the first page and print it
//test that the text on the first page is "Opening a new window".
//test that the first page Title is "The Internet".
// Click the "Click Here" button.
//test that the second page Title is "New Window".
// go back to the first page and test that the Title is "The Internet".
// go to the second page again.
// go back to the first page.


    @Test
    void test01() {

        //  https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get(" https://the-internet.herokuapp.com/windows");

        //  ilk sayfasının Handle degerini alın yazdırın
        String firstPageHandleValue = driver.getWindowHandle();
        System.out.println(firstPageHandleValue);

        //  ilk sayfadaki textin "Opening a new window" olduğunu test edin.
        String actualText = driver.findElement(By.tagName("h3")).getText();
        Assertions.assertEquals("Opening a new window",actualText);

        //  ilk sayfa Title'ının "The Internet" olduğunu test edin.
        Assertions.assertEquals("The Internet",driver.getTitle());

        //  "Click Here" butonuna tıklayın.
        driver.findElement(By.linkText("Click Here")).click();

        //  ikinci sayfa Title'ının "New Window" olduğunu test edin.
       Set<String> allWindowHandle = driver.getWindowHandles();
       for (String w : allWindowHandle){
           if (!w.equals(firstPageHandleValue)){
               driver.switchTo().window(w);
               break;
           }
       }
       String secondWindowHandle = driver.getWindowHandle();
       Assertions.assertEquals("New Window",driver.getTitle());

        //  ilk sayfaya dönün ve Title'ının "The Internet" olduğunu test edin.
        driver.switchTo().window(firstPageHandleValue);
        Assertions.assertEquals("The Internet",driver.getTitle());

        //  ikinci sayfaya tekrar geçin.
        driver.switchTo().window(secondWindowHandle);

        //  ilk sayfaya tekrar dönün.
        driver.switchTo().window(firstPageHandleValue);


        //PRATİK YONTEMLE YAP odev


    }
}
