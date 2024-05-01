package day11_actions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities01.TestBase_01;

public class C04_Actions extends TestBase_01 {
    //Go to https://jqueryui.com/droppable/
    //Drag me to my target webelement onto the Drop here webelement

    @Test
    void test01() {

        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");

        //Drag me to my target webelementini Drop here webelementi üzerine bıkalım
        driver.switchTo().frame(0);
        Actions actions = new Actions(driver);
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = drag.findElement(By.xpath("//div[@id='droppable']"));
        actions.dragAndDrop(drag,drop).perform();

        //draganddrop()

    }
    @Test
    void test02Yol() {

        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        Actions actions = new Actions(driver);
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = drag.findElement(By.xpath("//div[@id='droppable']"));

        //Drag me to my target webelementini Drop here webelementi üzerine bıkalım
        actions.clickAndHold(drag).moveToElement(drop).release().perform();
        //clickandhold=>tıkla ve basılı tut
        //moveToElement=>istenen elemente götürür
        //release=>basılı tutulan elementi serbest bırakır

    }
    @Test
    void test03Yol() {

        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        Actions actions = new Actions(driver);
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = drag.findElement(By.xpath("//div[@id='droppable']"));

        //Drag me to my target webelementini Drop here webelementi üzerine bıkalım
        actions.clickAndHold(drag).moveByOffset(136,34);
       //clickandhold=>
        //movebyoffset=>sayısal kordinata göre yerleştirir
    }
}
