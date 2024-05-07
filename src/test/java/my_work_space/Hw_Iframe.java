package my_work_space;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities01.TestBase_01;

public class Hw_Iframe extends TestBase_01 {

    @Test
    void iframeTest() {
        /*
        HOMEWORK:
        //https://html.com/tags/iframe/ sayfasina gidiniz
        // sayfada bulunan youtube videosunu baslatiniz
         */
        driver.get("https://html.com/tags/iframe/");
        driver.switchTo().frame(0);
        //WebElement playButton = driver.findElement(By.xpath("//video[@tabindex='-1']"));
        WebElement playButton = driver.findElement(By.xpath("//button[@title='Play']"));
        Actions actions = new Actions(driver);
        actions.scrollToElement(playButton).click().perform();




       /*
        //Events yazisina kadar scroll yapalim
        WebElement eventText = driver.findElement(By.xpath("//h2[.='Events']"));
        Actions actions = new Actions(driver);
        actions.scrollToElement(eventText).perform();*/

//DEVAM EDECEK
    }
}
