package day11_actions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities01.TestBase_01;

public class ActionsE extends TestBase_01 {

    @Test
    void actionsTest1() throws InterruptedException {
//  HOVER OVER=>üzerinde gezdirmek
//  Create a class : Actions1
//  Given user is on the https://www.amazon.com
        driver.get("https://www.amazon.com");
        //hover over accountListTab
        WebElement accountListTab = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountListTab).perform();
        Thread.sleep(3000);

//  When use click on "Account" link
        WebElement accountLink = driver.findElement(By.linkText("Account"));
        //accountLink.click();=>no need actions,this is more common
        actions.click(accountLink).perform();

//  Then verify the page title contains "Your Account"
        Assertions.assertTrue(driver.getTitle().contains("Your Account"));

//  Then scroll to Amazon Music element at the bottom of the page
        WebElement amazonMusic = driver.findElement(By.xpath("//a[text()='Amazon Music']"));
        actions.moveToElement(amazonMusic).perform();
        Thread.sleep(3000);

//  And click on it
        //amazonMusic.click();=>alternatively
        actions.click(amazonMusic).perform();

//  Then verify Amazon Music page is displayed
        Assertions.assertTrue(driver.getCurrentUrl().contains("music"));

//  Scroll the page up and down
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_DOWN).build().perform();//it is recommended to use when there is method chain.

    }
}
