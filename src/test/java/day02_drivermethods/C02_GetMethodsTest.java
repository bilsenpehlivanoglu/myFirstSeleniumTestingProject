package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_GetMethodsTest {
    public static void main(String[] args) {

     /*   WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Go to TechproEducation page https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com/");

        // Print the page title
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        //Verify if page title contains "IT"
        if (actualTitle.contains("IT")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        // Print the page address (url)
        String pageUrl = driver.getCurrentUrl();
        System.out.println("pageUrl = " + pageUrl);

        // Verify if google homepage url "education".
        if (pageUrl.contains("education")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        //Print the page handle value
        String windowHandle = driver.getWindowHandle();
        System.out.println("windowHandle = " + windowHandle);

        // Test whether the word "IT Programs" appears in the page HTML codes
        String pageSource = driver.getPageSource();
        if (pageSource.contains("IT Programs")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        // Close the page.
        driver.close();*/

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();

        // TechproEducation sayfasina gidin. https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com/");

        // Sayfa basligini(title) yazdirin
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        // Sayfa basliginin "IT" icerdigini test edin
        if (actualTitle.contains("IT")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
            System.out.println("Actual Title : "+actualTitle+" doesn't contain expected titler : IT");
        }

        // Sayfa adresini(url) yazdirin
        String pageUrl = driver.getCurrentUrl();
        System.out.println("pageUrl = " + pageUrl);

        // Sayfa url'inin "education" icerdigini test edin.
        if (pageUrl.contains("education")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        // Sayfa handle degerini yazdirin
        String pageHandleValue = driver.getWindowHandle();
        System.out.println("pageHandleValue = " + pageHandleValue);

        // Sayfa HTML kodlarinda "IT Programs" kelimesi gectigini test edin
       String htmlCodes = driver.getPageSource();
       if (htmlCodes.contains("IT Programs")){
           System.out.println("Test PASSED");
       }else {
           System.out.println("Test FAILED");
       }

        // Sayfayi kapatin.
        driver.quit();

    }
}
