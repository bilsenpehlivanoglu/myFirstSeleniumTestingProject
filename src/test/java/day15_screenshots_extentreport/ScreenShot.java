package day15_screenshots_extentreport;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities01.TestBase_01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenShot extends TestBase_01 {


    @Test
    void test01() throws IOException {
        //facebook sayfasina gidelim
        driver.get("https://facebook.com/");
        //screenshot alalim
        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(LocalDateTime.now());
        String path ="src/test/java/screenshots/facebook"+date+".png";
        TakesScreenshot ts = (TakesScreenshot) driver;
        Files.write(Paths.get(path) ,ts.getScreenshotAs(OutputType.BYTES));


    }
}
