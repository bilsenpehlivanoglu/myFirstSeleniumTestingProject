package day11_actions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities01.TestBase_01;

public class ActionsD extends TestBase_01 {
    @Test
    void actionsTest() {
//  DRAG AND DROP
//  Create a class : Actions
//  Create a method
//  Given user is on https://iqueryui.com/dropppable/
        driver.get("https://jqueryui.com/droppable/");
//  And user moves the target element(Drag me to my target) in to destination(Drop here)
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,target).perform();

    }

    @Test
    void actionTest1() {
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(source).moveToElement(target).build().perform();//tutar ve hedef yere yerleştirir
        actions.dragAndDropBy(source,40,50).perform();//kordinatlara göre yerleştirir
    }
}
