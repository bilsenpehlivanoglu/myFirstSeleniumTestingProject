package day09_iframe_windowhandles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities01.TestBase_01;

public class Iframe extends TestBase_01 {

    @Test
    void iframeTest() {
        //https://testcenter.techproeducation.com/index.php?page=iframe
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");

        //Ana sayfadaki 'An iframe with a thin black border:' metninde 'black border' yazisinin oldugunu test edin
        String actualText = driver.findElement(By.xpath("//*[.='An iframe with a thin black border:']")).getText();
        Assertions.assertTrue(actualText.contains("black border"));

        //Ayrica 'Applications lists' yazisinin sayfada oldugunu test edin
        driver.switchTo().frame(0);
       WebElement actualTitle= driver.findElement(By.xpath("//h1"));
       Assertions.assertTrue(actualTitle.getText().contains("Applications lists"));

        //sayfada iframe yazısının olduğunu test edin
        driver.switchTo().defaultContent();
        WebElement actualWrite = driver.findElement(By.xpath("//h3"));
        Assertions.assertTrue(actualWrite.getText().contains("iframe"));
    }
}
