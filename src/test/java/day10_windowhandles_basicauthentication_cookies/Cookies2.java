package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import utilities01.TestBase_01;

import java.util.Set;

public class Cookies2 extends TestBase_01 {

    @Test
    void cookiesTest() {
        driver.get("https://www.amazon.com");
//  Find the total number of cookies
     Set<Cookie> cookieList = driver.manage().getCookies();
        System.out.println("Cookie size : "+cookieList.size());
        waitForSecond(3);
//  Print all the cookies
        for (Cookie eachCookie : cookieList){
            System.out.println("Each Cookies :"+eachCookie);
            System.out.println("Cookie Value :"+eachCookie.getValue());
            System.out.println("Cookie Names :"+eachCookie.getName());
        }
//  Get the cookies by their name
        System.out.println("Cookies By Name => "+driver.manage().getCookieNamed("csm-sid"));
//  Add new cookie
//  Delete all of the cookies
    }
}
