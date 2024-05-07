package my_work_space;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities01.TestBase_01;

public class Hw_Actions extends TestBase_01 {

    @Test
    void actionTest() throws InterruptedException {
        //ÖDEV:
        //google sayfasına gidelim
        driver.get("https://amazon.com");
        Thread.sleep(4000);
        //Arama kutusuna "Selenium" yazın ve Enter tuşuna basın
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        Actions actions = new Actions(driver);
        searchBox.sendKeys("Selenium", Keys.ENTER);

        //Arattığımız kelimeyi arama kutusundan ctrl+x ile keselim
        actions.keyDown(searchBox,Keys.COMMAND).sendKeys("x").perform();
        //driver.navigate().back();
        //actions.keyDown(searchBox,Keys.COMMAND).sendKeys("v",Keys.ENTER).perform();

// actions.keyDown(searchBox,Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).perform();
        //Tekrar google sayfasına gidip kestiğimiz kelimeyi ctrl+v ile yapıştırıp tekrar aratalım


    }

    //ÖDEV : Drag webelementinin drop webelementinin üzerine bırakıldığını test edin

    //                actions.keyDown(searchBox, Keys.SHIFT)//arama kutusunda shift tuşuna basılı tutar
//                .sendKeys("selenium")//shift tuşuna basılı tutarak selenium yazar
//                .keyUp(Keys.SHIFT)//shift tuşundan elini kaldırır
//                .sendKeys("  - java",Keys.ENTER).perform();
        @Test
        void test01() {

            //https://jqueryui.com/droppable/ adresine gidelim
            driver.get("https://jqueryui.com/droppable/");



            //Drag me to my target webelementini Drop here webelementi üzerine bıkalım
            driver.switchTo().frame(0);
            //Drag elementi drop elementinin üzerinde değilken dropun üzerindeki yazının "Drop here" olduğunu doğrula.
            String  actualDropText=driver.findElement(By.cssSelector("div[id='droppable']")).getText();
            Assertions.assertEquals("Drop here",actualDropText);


            WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
            WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
            Actions actions = new Actions(driver);
            actions.dragAndDrop(drag,drop).perform();//=> drag webelementini drop webelementinin uzerine birakir

            //ÖDEV : Drag webelementinin drop webelementinin üzerine bırakıldığını test edin
            //Drag elemeti drop elementinin üzerine bırakıldığında dropun üzerindeki yazının "Dropped!" olduğunu doğrula.
            String  actualDropTextNext=driver.findElement(By.cssSelector("div[id='droppable']")).getText();
            Assertions.assertEquals("Dropped!",actualDropTextNext);

        }

}
