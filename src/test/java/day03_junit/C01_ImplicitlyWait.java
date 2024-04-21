package day03_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_ImplicitlyWait {
    public static void main(String[] args) {


     //Go to TechProEducation page
     //test that the page title contains TechPro Education
    //go to facebook page
    //test that the page url contains facebook
    //go back to techpro page
    //Test that you are back
     //close the page



    //techpro sayfasına gidiniz
   //sayfa başlığının TechPro Education içerdiğini test ediniz
   //facebook sayfasına gidiniz
   //sayfa url'inin facebook içerdiğini test ediniz
   //techpro sayfasına geri dönününüz
   //Geri döndüğünüzü test ediniz
   //sayfayı kapatınız

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //techpro sayfasına gidiniz
        driver.get("https://techproeducation.com");

        //sayfa başlığının TechPro Education içerdiğini test ediniz
        String expectedData = "TechPro Education";
        String actualData = driver.getTitle();
        if (actualData.contains(expectedData)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }
        //facebook sayfasına gidiniz
        driver.get("https://facebook.com");

        //sayfa url'inin facebook içerdiğini test ediniz
        String expected = "facebook";
        String actual = driver.getCurrentUrl();
        if (actual.contains(expected)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }
        //techpro sayfasına geri dönününüz
        driver.navigate().back();

        //Geri döndüğünüzü test ediniz
       if (driver.getCurrentUrl().equals("https://techproeducation.com")){
           System.out.println("TEST PASSED");
       }else {
           System.out.println("TEST FAILED");
       }

        //sayfayı kapatınız
        driver.quit();

    }
}
