package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // go to techproeducation homepage https://www.techproeducation.com/
        driver.navigate().to("https://www.techproeducation.com/");
        Thread.sleep(3000);

        //Go to Amazon page. https://www.amazon.com/
        driver.navigate().to(" https://www.amazon.com/");
        Thread.sleep(3000);

        //Go back to techproeducation page
        driver.navigate().back();
        Thread.sleep(3000);

        //Go to Amazon page again
        driver.navigate().forward();
        Thread.sleep(3000);

        //Refresh the page
        driver.navigate().refresh();

        //Close all pages
        driver.quit();


        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // techproeducation ana sayfasina gidelim . https://www.techproeducation.com/
        driver.navigate().to("https://www.techproeducation.com/");
        Thread.sleep(3000);

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.navigate().to(" https://www.amazon.com/");
        Thread.sleep(3000);

        //Tekrar techproeducation sayfasina donelim
        driver.navigate().back();
        Thread.sleep(3000);

        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(3000);

        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Tum sayfalari kapatalim
        driver.quit();*/


    }
}
