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

public class RadioButton1 {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    void radioTest() throws InterruptedException {
//  Go to the url https://testcenter.techproeducation.com/index.php?page=radio-buttons
      driver.get("https://testcenter.techproeducation.com/index.php?page=radio-buttons");

//  Click on Red if not already checked
    WebElement red = driver.findElement(By.id("red"));
    if (!red.isSelected()){
        red.click();
    }
    Thread.sleep(3000);
//  Click on Football if not already checked
    WebElement football = driver.findElement(By.id("football"));
    if (!football.isSelected()){
        football.click();
    }
        Thread.sleep(3000);
        Assertions.assertTrue(red.isSelected());
    Assertions.assertTrue(football.isSelected());
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
