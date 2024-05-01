package my_work_space;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities01.TestBase_01;

import java.util.List;

public class Hw_02 extends TestBase_01 {

    //==========Homework 2===========================

    @Test
    void selectByIndexTest() {
      //https://the-internet.herokuapp.com/dropdown adresine gidin
        driver.get("https://the-internet.herokuapp.com/dropdown");

      // 1.SelectByIndexTest methodunu oluşturun ve indeksi kullanarak Seçenek 1'i seçin
      WebElement option1 = driver.findElement(By.id("dropdown"));
        Select selectOption1 = new Select(option1);
        selectOption1.selectByIndex(1);
    }

    @Test
    void selectByValueTest() {
        // 2.SelectByValueTest methodunu oluşturun ve  value ile Seçenek 2'yi seçin
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement option2 = driver.findElement(By.id("dropdown"));
        Select selectOption2 = new Select(option2);
        selectOption2.selectByValue("2");
    }

    @Test
    void selectByVisibleTest() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        // 3.SelectByVisibleTextTest methodunu olusturun ve görünür metinle Seçenek 1 değerini seç
        WebElement secenek1 = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select selectSecenek1 = new Select(secenek1);
        selectSecenek1.selectByVisibleText("Option 1");

    }

    @Test
    void printAllTest() {
        // 4.printAllTest methodunu olusturun ve tüm seceneklerin metinlerini konsol a yazdirin,
        // secenekler arasinda "Option 2" oldugunu test edin
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement allOptions = driver.findElement(By.id("dropdown"));
        Select select =new Select(allOptions);
        List<WebElement> optionList = select.getOptions();
       for (WebElement w : optionList){
           System.out.println(w.getText());
        }

    }

    @Test
    void optionTest() {
        // 5.yeni bir method olusturun ve default olarak secili olan secenegin
        // "Please select an option" oldugunu test edin
        driver.get("https://the-internet.herokuapp.com/dropdown");
        String actualDefaultOption = driver.findElement(By.id("dropdown")).getText();
        Assertions.assertTrue(actualDefaultOption.contains("Please select an option"));

    }

    @Test
    void sizeTest() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        // 6.sizeTest adinda yeni bir method olusturun ve dropdown menudeki secenek sayisinin 3 oldugunu test edin,
        WebElement dropDownMenu =  driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDownMenu);
        int actualOption = select.getOptions().size();
        Assertions.assertEquals(3, actualOption);


    }
}
