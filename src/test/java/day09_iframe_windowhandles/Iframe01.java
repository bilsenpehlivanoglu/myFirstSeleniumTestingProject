package day09_iframe_windowhandles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities01.TestBase_01;

public class Iframe01 extends TestBase_01 {

    @Test
    void iframeTest1() {
        //https://the-internet.herokuapp.com/iframe sayfasına gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");

        //Kalın yazının "Editor" kelimesini içerdiğini doğrulayınız
        String actualtext = driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertTrue(actualtext.contains("Editor"));

        //Textbox içindeki yazıyı siliniz.
        driver.switchTo().frame(0);
       WebElement textBox = driver.findElement(By.xpath("//p"));
       textBox.clear();

        //Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
        textBox.sendKeys("Bu textbox iFrame içinde yer almaktadır");

        //Sayfadaki "Elemental Selenium" yazısının olduğunu doğrulayınız.
        driver.switchTo().defaultContent();
       WebElement particalLink = driver.findElement(By.partialLinkText("Elemental Selenium"));
       Assertions.assertEquals("Elemental Selenium",particalLink.getText());

    }
}
