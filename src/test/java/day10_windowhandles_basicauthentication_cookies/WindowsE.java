package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities01.TestBase_01;

import java.util.Set;

public class WindowsE extends TestBase_01 {


    @Test
    void windowTest() {
//  Given Go to https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows");

//  Assert if the window 1 title equals "The Internet"
        Assertions.assertTrue(driver.getTitle().contains("The Internet"));

//  Click on the Link
        driver.findElement(By.xpath("//a[.='Click Here']")).click();

//  Assert if the window 2 title equals "New Window"
//  NOTE: we must switch window 2 to get window to title
        String window1Handle = driver.getWindowHandle();//1.sayfanın handle degeri
        System.out.println(window1Handle);

        Set<String> allWindowHandles = driver.getWindowHandles();//1 ve 2. sayfanın handle degeri
        System.out.println(allWindowHandles);

        for (String eachHandle : allWindowHandles){
            if (!eachHandle.equals(window1Handle)){
                driver.switchTo().window(eachHandle);
                break;
            }
        }
//      NOW DRIVER IS ON THE WINDOW 2
        Assertions.assertTrue(driver.getTitle().equals("New Window"));
        String window2Handle = driver.getWindowHandle();

//  Switch back to window 1 title and assert if URL contains "windows"
        driver.switchTo().window(window1Handle);
        Assertions.assertTrue(driver.getCurrentUrl().contains("windows"));

//  And assert if the URL doesn't contains 'new'
        Assertions.assertFalse(driver.getCurrentUrl().contains("new"));

//  Switch back to window to 2
        driver.switchTo().window(window2Handle) ;

//   Switch back to window to 1
        driver.switchTo().window(window1Handle);
    }


}
