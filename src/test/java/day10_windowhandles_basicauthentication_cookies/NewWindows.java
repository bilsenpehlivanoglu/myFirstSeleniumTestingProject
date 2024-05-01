package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;
import utilities01.TestBase_01;

public class NewWindows extends TestBase_01 {

    @Test
    void newTabTest() throws InterruptedException {
// Open the pages in 2 new windows and verify their TITLES
// Linkedin
        driver.get("https://www.linkedin.com");
        Assertions.assertTrue(driver.getTitle().contains("LinkedIn"));
        String linkedinHandle = driver.getWindowHandle();
// Ebay
//  I would like to open ebay page in a new TAB
        driver.switchTo().newWindow(WindowType.TAB);// CREATES A NEW TAB AND SWITCH TO NEW TAB

//   driver is on the new TAB at this point
        driver.get("https://www.ebay.com");
        Assertions.assertTrue(driver.getTitle().contains("eBay"));
        String ebayHandle = driver.getWindowHandle();
        Thread.sleep(3000);
//   Switch back to the Linkedin page
        driver.switchTo().window(linkedinHandle);
        System.out.println("LINKEDIN URL = " + driver.getCurrentUrl());


//    Switch back to ebay page
        driver.switchTo().window(ebayHandle);
        System.out.println("EBAY URL= " + driver.getCurrentUrl());

    }

    @Test
    void newWindowTest() throws InterruptedException {
// Open the pages in 2 new windows and verify their TITLES
// Linkedin
        driver.get("https://www.linkedin.com");
        Assertions.assertTrue(driver.getTitle().contains("LinkedIn"));
        String linkedinHandle = driver.getWindowHandle();
// Ebay
//  I would like to open ebay page in a new TAB
        driver.switchTo().newWindow(WindowType.WINDOW);// CREATES A NEW TAB AND SWITCH TO NEW TAB

//   driver is on the new TAB at this point
        driver.get("https://www.ebay.com");
        Assertions.assertTrue(driver.getTitle().contains("eBay"));
        String ebayHandle = driver.getWindowHandle();
        Thread.sleep(3000);
//   Switch back to the Linkedin page
        driver.switchTo().window(linkedinHandle);
        System.out.println("LINKEDIN URL = " + driver.getCurrentUrl());

//    Switch back to ebay page
        driver.switchTo().window(ebayHandle);
        System.out.println("EBAY URL= " + driver.getCurrentUrl());

    }
}
