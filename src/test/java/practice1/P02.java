package practice1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities01.TestBase_01;

import java.time.Duration;

public class P02 extends TestBase_01 {

    @Test
    void test01() {
        // https://testpages.herokuapp.com/styled/challenges/growing-clickable.html adresine gidiniz
        driver.get("https://testpages.herokuapp.com/styled/challenges/growing-clickable.html");
        // click me buttonu na tiklayiniz
        WebElement clickMe = driver.findElement(By.id("growbutton"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.attributeContains(clickMe,"class","grown"));
        clickMe.click();
        // "Event Triggered" yazisinin görüntülendigini dogrulayiniz
        WebElement eventText = driver.findElement(By.id("growbuttonstatus"));
        Assertions.assertEquals("Event Triggered",eventText.getText());
    }
}
