package day07_css_relativelocators_dropdown;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropdownMenu {

     /*
    Dropdown u automate etmek icin
    1- Dropdown menuyu ilk olarak locate ederiz
    2- Select objecti olusturulur
    3- Select objecti uzerinden istedigimiz method ile secim yapariz
        SYNTAX
        Select options = new Select(Webelement dropdown);
        a-selectByVisibleText()->Kullanici tarafindan görünür metin ile secim yapmak icin kullanilir
        b-selectByIndex()->Index ile secim yapmak icin kullanilir ( index 0 dan baslar)
        c-selectByValue()->value atribute degeri ile secim yapmak icin kullanilir
    4- getOptions() -> Locate ettigimiz dropdown menu deki tum secenekleri bize verir
    5- getFirstSelectedOption() -> Dropdown menudeki secili olan seceneği bize verir
     */

    WebDriver driver;
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }
    //   -3 farklı test methodu oluşturalım
    @Test
    void test1() {
        // 1.Method:
        //           a. Yil,ay,gün dropdown menu'leri locate ediniz
        WebElement year = driver.findElement(By.id("year"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));

        //           b. Select objesi olustur
        Select selectYear = new Select(year);
        Select selectMonth = new Select(month);
        Select selectDay = new Select(day);

        //           c. Select object i kullaarak 3 farkli sekilde secim yapiniz
        selectYear.selectByIndex(2);
        selectMonth.selectByValue("0");
        selectDay.selectByVisibleText("1");
    }

    @Test
    void test2() {
        //   Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken
        //       2.Method:
        //           a. Tüm eyalet isimlerini yazdıralım
        WebElement statesNames = driver.findElement(By.id("state"));
        Select select =new Select(statesNames);
        List<WebElement> list = select.getOptions();

    }

    @Test
    void test3() {
        // 3.Method:
        //  a. State dropdownindaki varsayilan secili secenegin 'Select a State' oldugunu verify edelim
       WebElement option = driver.findElement(By.cssSelector("#state"));
       Select select =new Select(option);
       String actualOption = select.getFirstSelectedOption().getText();
       String expectedOption = "Select a State";
       Assertions.assertEquals(expectedOption,actualOption);

    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
