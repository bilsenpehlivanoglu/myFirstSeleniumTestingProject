package day08_alert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities01.TestBase_01;

public class Alerts extends TestBase_01 {

    //    Create a class: AlertTest
    //    Create 3 test methods:

    @Test
    void acceptAlert() {
//    Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts
       driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
//    !!!!NOW AT THIS POINT THERE IS AN ALERT ON THE PAGE THAT MUST BE HANDLED!!!
//    acceptAlert() => click on the first alert,
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//    verify the text "I am a JS Alert",
       String actualText = driver.switchTo().alert().getText();
        Assertions.assertTrue(actualText.equals("I am a JS Alert"));
//    click OK.
        driver.switchTo().alert().accept();
//    and verify "You successfully clikked an alert"
      Assertions.assertTrue(driver.findElement(By.id("result")).getText().equals("You successfully clicked an alert"));

    }

    @Test
    void dismissAlert() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
//   dismissAlert() => click on the second alert,
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//    ALERT POPS UP
//   verify text "I am a JS Confirm",
      String actualText = driver.switchTo().alert().getText();
      Assertions.assertTrue(actualText.equals("I am a JS Confirm"));
//   click cancel,
        driver.switchTo().alert().dismiss();
//   and Verify "You clicked: Cancel"
      String visibleText = driver.findElement(By.id("result")).getText();
      Assertions.assertTrue(visibleText.equals("You clicked: Cancel"));

    }

    @Test
    void sendKeysAlert() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
//   sendKeysAlert() => click on the third alert,
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
//   verify text "I am a JS prompt",
      Assertions.assertTrue(driver.switchTo().alert().getText().equals("I am a JS prompt"));
//   type "Hello World",
        driver.switchTo().alert().sendKeys("Hello World");
//   click OK,
        driver.switchTo().alert().accept();
//   and Verify "You entered: Hello World"
     Assertions.assertTrue(driver.findElement(By.id("result")).getText().equals("You entered: Hello World"));
    }
}
