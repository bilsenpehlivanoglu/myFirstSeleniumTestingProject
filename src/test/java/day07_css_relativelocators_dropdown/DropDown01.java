package day07_css_relativelocators_dropdown;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities01.TestBase_01;

import java.util.List;

public class DropDown01 extends TestBase_01 {

   /* How to select from a dropdown?
   3 ways to select a dropdown option: index, value, visibleText,
   How to get selected option from a dropdown?
   getFirstSelectedOption method
   */

    @Test
    void dropdownTest() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
//     2000 February 15
//     1.Locate the dropdown element
        WebElement year = driver.findElement(By.id("year"));
//     2.Create a Select Object
        Select selectYear = new Select(year);
//     3.Now that we have select object,we can interact with this dropdown element
        selectYear.selectByVisibleText("2000");

//     month
      WebElement month = driver.findElement(By.id("month"));
      Select selectMonth = new Select(month);
      selectMonth.selectByIndex(1);

//     day
       WebElement day = driver.findElement(By.id("day"));
       Select selectDay = new Select(day);
       selectDay.selectByValue("15");

//     Assert if 2000 is selected
       WebElement selectedYear = selectYear.getFirstSelectedOption();
       Assertions.assertTrue(selectedYear.getText().equals("2000"));

//     Get all the months and assert if April is an option in the month dropdown
        List<WebElement> allMonths = selectMonth.getOptions();
        boolean isAprilExist=false;
        for (WebElement eachMonth : allMonths){
            System.out.println(eachMonth.getText());
            if (eachMonth.getText().equals("April")){
                isAprilExist=true;
            }
        }
        Assertions.assertTrue(isAprilExist);
    }

    @Test
    void stateTest() {
//  https://testcenter.techproeducation.com/index.php?page=dropdown
//  Create a new test method: statesTest is this class
//  Then print the total number of states from the dropdown
//  Then print all the state names
//  Select 'Texas' opting using one of the method
//  Assert is Texas is selected or not
//  Then check is the state names are in alphabetical order
//  (THIS WILL FAIL B/C STATE LIST IS NOT ALPHABETICAL ORDER)
    }
}
