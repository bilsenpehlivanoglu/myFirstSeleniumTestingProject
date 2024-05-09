package practice1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities01.TestBase_01;

public class P01 extends TestBase_01 {

    // https://demo.guru99.com/test/radio.html
// select Option2 from the radio button
// select if checkbox1 and checkbox3 are not selected
// Test that Option2 is selected from the radio button
//Test that Option 3 is not selected in the radio button
//test that checkbox1 and checkbox3 are selected
//test if checkbox2 element is not selected



    @Test
    void test01() {
        // https://demo.guru99.com/test/radio.html
        driver.get("https://demo.guru99.com/test/radio.html");
        // radio button dan Option2 yi seçin
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        radio2.click();
        // checkbox1 ve checkbox3 seçili değilse seçin
        WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
        WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
        if (!checkbox1.isSelected()){
            checkbox1.click();
        }
        if (!checkbox3.isSelected()){
            checkbox3.click();
        }
        // radio button dan Option2 seçili oldugunu test edin
        Assertions.assertTrue(radio2.isSelected());
        // radio button da Option 3 ün secili olmadigini test edin
       WebElement radio3 =  driver.findElement(By.id("vfb-7-3"));
       Assertions.assertFalse(radio3.isSelected());
        // checkbox1 ve checkbox3 seçili olduğunu test edein
        Assertions.assertTrue(checkbox1.isSelected());
        Assertions.assertTrue(checkbox3.isSelected());
        // checkbox2 elementinin seçili olmadığını test edin
        WebElement checkBox2 = driver.findElement(By.id("vfb-6-1"));
        Assertions.assertFalse(checkBox2.isSelected());
    }
}
