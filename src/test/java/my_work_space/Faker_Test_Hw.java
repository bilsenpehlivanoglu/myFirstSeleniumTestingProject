package my_work_space;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities01.TestBase_01;

public class Faker_Test_Hw extends TestBase_01 {


    @Test
    void fakerTestHw() throws InterruptedException {
        //HOMEWORK
        //1. "https://facebook.com" Adresine gidin
        driver.get("https://facebook.com");
        Faker faker = new Faker();

        Thread.sleep(3000);
        //2. "create new account" butonuna basin
        WebElement createNewAccount = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        createNewAccount.click();
        //3. "firstName" giris kutusuna bir isim yazin
        //4. "surname" giris kutusuna bir soyisim yazin
        //5. "email" giris kutusuna bir email yazin
        //6. "email" onay kutusuna emaili tekrar yazin
        //7. Bir sifre girin
        WebElement signUp = driver.findElement(By.name("firstname"));
        signUp.sendKeys(faker.name().firstName(),Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.phoneNumber().cellPhone(),Keys.TAB,
                faker.internet().password());

        //8. Tarih icin gun secin
        //9. Tarih icin ay secin
        //10. Tarih icin yil secin
        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));
        WebElement year = driver.findElement(By.id("year"));
        month.sendKeys("Aug");
        day.sendKeys("15");
        year.sendKeys("2024");

        //11. Cinsiyeti secin
        WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
        WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
        if (!female.isSelected()){
            female.click();
        }
        //12. Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test
        //edin.
        Assertions.assertFalse(male.isSelected());

        //13. Sayfayi kapatin
        driver.quit();


    }
}
