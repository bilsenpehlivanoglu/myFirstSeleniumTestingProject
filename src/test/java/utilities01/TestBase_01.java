package utilities01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public abstract class TestBase_01 {

   /* TestBase class is used for calling repetitive pre-conditions and post-conditions make the driver protected because it should be visible in the other classes
   Test base will be exteded other test classes and
   @Before and @After methods will be automatically executed
   */
    protected static WebDriver driver;//protected bir inheritance

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    }

    /*@AfterEach
    void tearDown() {
        driver.quit();
    }*/
    //HARD WAIT
   /* public void waitForSecond(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    //select visibleText DropDownMenu
    public void selectVisible(WebElement ddm, String option){
        Select select = new Select(ddm);
        select.selectByVisibleText(option);
    }
    //select Index DropDownMenu
    public void selectIndex(WebElement ddm,int index){
        Select select = new Select(ddm);
        select.selectByIndex(index);
    }*/
           /*//select Value DropDownMenu

           public void selectValue (WebElement ddm, String value){
               Select select=new Select(ddm);
               select.selectByValue(value);
           }*/
//    Create a method that select an option from a dropdown index
      public static void dropdownSelectByIndex(WebElement dropdownElement,int index){
          Select select = new Select(dropdownElement);
          select.selectByIndex(index);
      }
      public static void dropdownSelectByIndex(By locator,int index){
          WebElement dropdownElement = driver.findElement(locator);
          Select select = new Select(dropdownElement);
          select.selectByIndex(index);
      }
      public static void dropdownSelectByIndex(String xpath,int index){
          WebElement dropdownElement = driver.findElement(By.xpath(xpath));
          Select select = new Select(dropdownElement);
          select.selectByIndex(index);

      }
      public static void dropdownSelectByVisibleText(WebElement dropdownElement, String text){
          Select select = new Select(dropdownElement);
          for (int i =0;i<select.getOptions().size();i++){
              if (select.getOptions().get(i).getText().equalsIgnoreCase(text)){
                  select.getOptions().get(i).click();
                  break;
              }
          }
      }
      public static void dropdownSelectByValue(WebElement dropdownElement, String value){
          Select objSelect = new Select(dropdownElement);
          objSelect.selectByValue(value);
      }
      public static void dropdownCustomMethod(WebElement dropdownElement,String textOfDropdown){
          List<WebElement> options = dropdownElement.findElements(By.tagName("option"));
          for (WebElement option : options){
              System.out.println(option.getText());
              if (option.getText().equals(textOfDropdown)){
                  option.click();
                  break;
              }
          }
      }
      /*public static void dropdownSelectRandomly(Select select){
          Random random = new Random();
          List<WebElement> list = select.getOptions();
          int optionIndex = 1 + random.nextInt(list.size() - 1);
          select.selectByIndex(optionIndex);
          return;select.getFirstSelectedOption();
      }*/
    public ArrayList<String> dropdownGetSelectedOptions(WebElement dropdownElement) throws Exception{
      if (dropdownElement!=null){
          Select list = new Select(dropdownElement);
          ArrayList<WebElement> allSelectedOptions = (ArrayList<WebElement>) list.getAllSelectedOptions();
         ArrayList<String> result =new ArrayList<String>();
         for (WebElement eachSelected : allSelectedOptions){
             result.add(eachSelected.getText());
         }
         return result;
      }else {
          throw new Exception("No element is returned");
      }
    }
      //ALERTS
    public static void alertAccept(){
        driver.switchTo().alert().accept();
    }
    public static void alertDismiss(){
        driver.switchTo().alert().accept();
    }
    /*public static void alertGetText(){
       return driver.switchTo().alert().getText();
    }*/


}
