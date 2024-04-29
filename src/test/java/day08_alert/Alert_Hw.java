package day08_alert;

import org.junit.jupiter.api.Test;
import utilities01.TestBase_01;

public class Alert_Hw extends TestBase_01 {
    @Test
    void alertTest() {
        //Homework : TEST CASE
//  When navigate to https://testpages.herokuapp.com/styled/windows-test.html
        driver.get("https://testpages.herokuapp.com/styled/windows-test.html");
//  When Click on "Alerts ın A New Window From JavaScript"
//  And Switch to new window
//  And click on "Show alert box"button
//  And Accept alert
//  And Click on "Show confirm box"button
//  And Cancel alert
//  Then Assert that alert is canceled
//  When Click on "Show prompt box"button
//  And Send "Hello World!"to the alert
//  Then Assert that "Hello World!"is sent
    }

}
