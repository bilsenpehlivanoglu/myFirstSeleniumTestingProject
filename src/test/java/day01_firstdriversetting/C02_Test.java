package day01_firstdriversetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Test {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Navigate to Amazon homapage
        driver.get("https://amazon.com/");

        //Verify if amazon homapage url is "https://amazon.com/"
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://amazon.com/")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("TEST FAILED : Actual URL "+currentUrl+" but expected URL is https://amazon.com" );
        }
        driver.quit();

    }
}
