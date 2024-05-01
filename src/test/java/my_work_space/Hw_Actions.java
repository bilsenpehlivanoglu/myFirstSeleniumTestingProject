package my_work_space;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities01.TestBase_01;

public class Hw_Actions extends TestBase_01 {

    @Test
    void actionTest() throws InterruptedException {
        //ÖDEV:
        //google sayfasına gidelim
        driver.get("https://amazon.com");
        Thread.sleep(4000);
        //Arama kutusuna "Selenium" yazın ve Enter tuşuna basın
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        Actions actions = new Actions(driver);
        searchBox.sendKeys("Selenium", Keys.ENTER);

        //Arattığımız kelimeyi arama kutusundan ctrl+x ile keselim
        actions.keyDown(searchBox,Keys.COMMAND).sendKeys("+").sendKeys("c").perform();

// actions.keyDown(searchBox,Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).perform();
        //Tekrar google sayfasına gidip kestiğimiz kelimeyi ctrl+v ile yapıştırıp tekrar aratalım
        driver.navigate().back();
        actions.sendKeys(searchBox,Keys.COMMAND).sendKeys("Selenium").sendKeys("v").perform();

        //ÖDEV : Drag webelementinin drop webelementinin üzerine bırakıldığını test edin

//                actions.keyDown(searchBox, Keys.SHIFT)//arama kutusunda shift tuşuna basılı tutar
//                .sendKeys("selenium")//shift tuşuna basılı tutarak selenium yazar
//                .keyUp(Keys.SHIFT)//shift tuşundan elini kaldırır
//                .sendKeys("  - java",Keys.ENTER).perform();
    }
}
