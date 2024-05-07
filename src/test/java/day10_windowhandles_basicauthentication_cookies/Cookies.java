package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import utilities01.TestBase_01;

import java.util.Set;

public class Cookies extends TestBase_01 {

//1-Go to Amazon homepage
//2-print all the cookies in the console with a loop
//3-Test that the number of cookies on the page is greater than 5
//4-Test that the value of the cookie named i18n-prefs is USD
//5-Create a cookie with the name "my favorite cookie" and the value "chocolate" and add it to the page
//6-Test that the cookie you added has been added to the page
//7-delete the cookie named skin and test whether it is deleted
//8-delete all cookies and test if they are deleted


    @Test
    void test01() throws InterruptedException {

        //1-Amazon anasayfaya gidin
        driver.get("https://amazon.com");
        Thread.sleep(3000);
        //2-tum cookie'leri consolda bir loop ile yazdirin
        Set<Cookie> cookieSet = driver.manage().getCookies();
        int counter = 1;
        for (Cookie w : cookieSet){
            System.out.println(counter+" . cookie => "+ w);
            System.out.println(counter+" . cookie => "+ w.getName());
            System.out.println(counter+" . cookie => "+ w.getValue());
            System.out.println("==================================");
            counter++;

        }
        //3-Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        //4-ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        //5-ismi "en sevdigim cookie" ve degeri "cikolatali" olan bir cookie olusturun ve sayfaya ekleyin
        //6-eklediginiz cookie'nin sayfaya eklendigini test
        //7-ismi skin olan cookie'yi silin ve silindigini test edin
        //8-tum cookie'leri silin ve silindigini test edin


    }
}
