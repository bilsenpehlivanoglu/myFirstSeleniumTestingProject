package day06_xpath_css;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_XPath {

     /*
    /   -> Bir alt child i secer
    //  -> Sayfadaki herhangi bir webelementi seçer //div
    @   -> Bir webelementin attribute unu secmek icin kullanilir
    []  -> Index veya kosul belirtmek icin kullanilir
    *   -> Herhangi bir webelementi secer (farketmeksizin)

    SYNTAX

    //tagName [  @  attriubuteName  =  'attributeValue'   ]
    //*       [  @     *            =  'attributeValue'   ]
   (//tagName [  @  attriubuteName  =  'attributeValue'   ])[index]

     */

    //go to the web page. https://www.amazon.com/
    //Search "city bike" in the search box (locate the search box with xpath)
   //Print the number of relevant results displayed on Amazon
   //Just print the result number
   //Then click on the text of the first result that appears.
   //close the page

    @Test
    void test01() {
        //web sayfasına gidin. https://www.amazon.com/
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.amazon.com/");

        //Arama kutusunda "city bike" aratin (arama kutusunu xpath ile locate edin)
        WebElement searchBox = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
        searchBox.sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement result = driver.findElement(By.xpath("(//div[@class = 'sg-col-inner'])[1]"));
        System.out.println("result.getText() = " + result.getText());//1-16 of over 1,000 results for "city bike"

        //Sadece sonuc sayısını yazdırınız
        System.out.println("result.getText().split() = " + result.getText().split(" ")[3]);

        //Sonra karşınıza çıkan ilk sonucun metnine tıklayın.
        driver.findElement(By.xpath("(//span[@class = 'a-size-medium a-color-base a-text-normal'])[1]")).click();

        //sayfayi kapatınız
        driver.quit();
    }

}
