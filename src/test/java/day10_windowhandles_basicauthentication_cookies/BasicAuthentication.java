package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities01.TestBase_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BasicAuthentication extends TestBase_01 {
    //Authenticate using the following information:
    // Url: https://the-internet.herokuapp.com/basic_auth
    // Username: admin
    //Password: admin
    // Congratulations! You must have the proper credentials. verify that the post has appeared
    //Click on the Elemental Selenium link
    //Let's test that the header contains Elemental Selenium


    @Test
    void test01() {
        //Aşağıdaki bilgileri kullanarak authentication yapınız:
        //    Url: https://the-internet.herokuapp.com/basic_auth
        //    Username: admin
        //    Password: admin
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        //    Congratulations! You must have the proper credentials. yazının çıktığını doğrulayın
       String actualText = driver.findElement(By.xpath("//p")).getText();
        Assertions.assertEquals("Congratulations! You must have the proper credentials.",actualText);

        //Elemental Selenium linkine tıklayınız
        driver.findElement(By.linkText("Elemental Selenium")).click();

        //Başlığın Elemental Selenium içerdiğini test edelim
        List<String> windowsList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowsList.get(1));
        Assertions.assertTrue(driver.getTitle().contains("Elemental Selenium"));

    }
}
