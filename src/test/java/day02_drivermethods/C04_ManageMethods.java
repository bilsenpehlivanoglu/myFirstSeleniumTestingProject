package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Go to the TechPro page
        driver.get("https://www.techproeducation.com/");
        Thread.sleep(3000);

        //Print the pages sizes
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        //Make the page as an image
        driver.manage().window().minimize();

        //Wait for 3 seconds when its an image and then maximize it
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Print the pages sızes ın maximized
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        //Make the page fulscreen
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        //Print the pages sizes whıle the fullscreen
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        //Close the page
        driver.quit();



       /* WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //TechPro sayfasina gidelim. https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com/");
        Thread.sleep(3000);

        //Sayfanin boyutlarini yazdirin
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Sayfanin boyutlarini maximize durumunda yazdirin
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        //Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        //Sayfanin boyutlarini fullscreen durumunda yazdirin
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        //Sayfayi kapatin
        driver.close();


*/

    }
}
