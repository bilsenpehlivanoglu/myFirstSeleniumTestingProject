package day11_actions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities01.TestBase_01;

public class C02_Actions extends TestBase_01 {

    //Go to Amazon https://www.amazon.com/
//Go to the "Account & Lists" menu in the upper right section and click on the "Account" option
//Verify that the title of the opened page contains "Your Account"

    @Test
    void test01() throws InterruptedException {

        //Amazon a gidelim https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        Thread.sleep(4000);

        //Sag ust bolumde bulunan "Account & Lists" menüsüne git  "Account" secenegine tikla
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountList).perform();
        driver.findElement(By.xpath("//span[.='Account']")).click();

        //Acilan sayfanin Title in "Your Account" icerdigini dogrula
        Assertions.assertTrue(driver.getTitle().contains("Your Account"));

       //moveToElement=>istenen elemente gider
    }
}
