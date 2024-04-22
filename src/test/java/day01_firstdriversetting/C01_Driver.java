package day01_firstdriversetting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class C01_Driver {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver(); //bir tane ChromeDriver objesi oluşturduk
        // ve onu WebDriver data tipinde bir driver objesine assign ettik.
        //BU YAZDIGIMIZ KOD BİZE BOŞ BİR BROWSER SAYFASI AÇAR
        driver.get("https://google.com");//get() methodu ile string olarak belirttiğimiz url e gideriz.
        driver.quit();// oturumu sonlandırır


    }
}
