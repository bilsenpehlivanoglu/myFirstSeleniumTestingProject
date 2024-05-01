package day09_iframe_windowhandles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities01.TestBase_01;

public class IFrames extends TestBase_01 {

//  Given Go to https://testpages.herokuapp.com/styled/frames/frames-test.html
//  Then Assert that"Left List Item 29"is the last element in the "Left"
//  And Assert that "Middle-List Item 39"is the last element in the "Middle"

    @Test
    void iframes() {
     driver.get("https://testpages.herokuapp.com/styled/frames/frames-test.html");
//  Then Assert that"Left List Item 29"is the last element in the "Left"
//  "Left List Item 29" IS INSIDE THE IFRAME SO SWITCH TO THAT FRAME FIRST=>"
//  Left List Item 29"iframe içinde olduğundan önce o çerçeveye geçin

       /* NOTE 1 : There are 3 ways to switch to a frame:index,id/name,webelement
        1.driver.switchTo().frame(1)->index;
        1.driver.switchTo().frame("left)->id/name;
        1.driver.switchTo.frame(driver.findElement(By.xpath("//frame[@name='left']"))->webelement
        NOTE 2 : when you want to switch to non child such as sibling frames,we should go to parent then the child.
        We can not jump directly to siblings.*/

     driver.switchTo().frame("left");
//   NOT WE ARE INSIDE THIS IFRAME=>biz bu iframenin içinde degiliz
     String lastElement = driver.findElement(By.xpath("//li[last()]")).getText();
        System.out.println("lastElement = " + lastElement);
        Assertions.assertTrue(lastElement.equals("Left List Item 29"));

//  And Assert that "Middle List Item 39"is the last element in the "Middle"
//   to Go to sibling frames,switch to the parent first,then switch to the child
//   =>kardeş çercevelerine gitmek için önce ebeveyne sonra çocuga geçin.
     driver.switchTo().defaultContent();
     driver.switchTo().frame("middle");
     String lastMiddleElement = driver.findElement(By.xpath("//li[last()]")).getText();
     Assertions.assertTrue(lastMiddleElement.equals("Middle List Item 39"));

    }
}
