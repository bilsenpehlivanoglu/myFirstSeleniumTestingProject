package day03_junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ClassWork {

    WebDriver driver;

    @BeforeEach
    void setUp() {
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    void test01() {
        driver.get("https://techproeducation.com");
    }

    @Test
    void test02() {
        driver.get("https://facebook.com");
    }

    @Test
    void test03() {
        driver.get("https://google.com");
    }

    @AfterEach
    void tearDown() {
        driver.close();
    }
}
