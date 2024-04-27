package day06_xpath_css;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckBox1 {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    void test() throws InterruptedException {
//   Go to https://testcenter.techproeducation.com/index.php?page=checkboxes
        driver.get("https://testcenter.techproeducation.com/index.php?page=checkboxes");
     Thread.sleep(3000);
//   Locate the elements of checkboxes
     WebElement checkBox1 = driver.findElement(By.id("box1"));
     WebElement checkBox2 = driver.findElement(By.id("box2"));

//   Then click on checkbox1 if box is not selected
        if (!checkBox1.isSelected()){
            checkBox1.click();
        }
        Thread.sleep(3000);
//   Then click on checkbox2 if box is not selected
        if (!checkBox2.isSelected()){
            checkBox2.click();
        }
        Thread.sleep(3000);
//   Then verify that checkbox1 and checkbox2 is checked
        Assertions.assertTrue(checkBox1.isSelected());
        Assertions.assertTrue(checkBox2.isSelected());
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
