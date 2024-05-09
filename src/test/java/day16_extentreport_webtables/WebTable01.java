package day16_extentreport_webtables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities01.TestBase_01;

import java.util.List;

public class WebTable01 extends TestBase_01 {

    @Test
    void webtablesTest() {

//  https://the-internet.herokuapp.com/tables
        driver.get("https://the-internet.herokuapp.com/tables");
//  Create a class:WebTables
//  Task1 : Print the entire table And Assert if the last element in the table 1 is "edit delete"
        System.out.println("***Task 1 : Print the entire table***");
        String entireTable = driver.findElement(By.xpath("//table[@id='table1']")).getText();
        System.out.println(entireTable);
//  ALTERNATIVELY
        int dataNum = 1;
        List<WebElement> elementList = driver.findElements(By.xpath("//table[@id='table1']//td"));
        for (WebElement eachElement : elementList){
            System.out.println("Data "+dataNum+" => " +eachElement.getText());
        }
        Assertions.assertTrue(elementList.get(elementList.size()-1).getText().equals("edit delete"));
//  Task2 : Print all rows
        System.out.println("***Task 2 : Print All Rows***");
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        int rowNum = 1;
        for (WebElement eachRow : allRows){
            System.out.println("Row "+rowNum+" => "+eachRow.getText() );
            rowNum++;
        }
//  Task3 : Print last row data only
        System.out.println("***Task 3 : Print last row data only***");
        System.out.println("Last row : "+allRows.get(allRows.size()-1).getText());

//  Task4 : Print column 5 data in the table body
        System.out.println("***Task 4 :  Print column 5 data in the table body***");
        List<WebElement> col5 = driver.findElements(By.xpath("//table[@id='table1']//tr//td[5]"));
        int colNum =1;
        for (WebElement each : col5){
            System.out.println("Column "+colNum+" => "+each.getText());
            colNum++;
        }
        System.out.println("Column 5 data");
//  HOMEWORK:Task5 : Write a method that accepts 2 parameters
//  Parameter 1 = row number
//  Parameter 2 = column number
//  printData(2,3); => prints data 2nd row 3rd column
        printData(2,3);
    }
    public void printData(int rowNum,int colNum){

    }
}
