package day01_firstdriversetting;

public class Answer_The_Questions {

    /*
    1.How do you go to a page in Selenium?
    -get or navigate to method.get is more common

    2.What is the difference between get and navigate methods?
    -both are used to go to a page
    -get is shorter than navigate to
    -navigate has to,back,forward,refresh methods as well
    -get accepts only string,but navigate to accepts string or URL

    3.What is the difference between close and quit in Selenium?
    -close closed only last active window,but quit closes all open window.

    4.What is Thread.sleep?
    -it is a JAVA wait.this is HARD WAIT.This is not Selenium wait.

    */

    /*QUOTE OF THE DAY://gunun sozu
    -Testers do not write a code to PASS
    -We write a code to CATCH A BUG
     */

    /*-Our test case failed for this reason.TEST FAILED : Actual URL https://www.amazon.com/ but expected URL is https://amazon.com
       as tester,I shouldn't fix the code to PASS
       STEPS:
      -1.Communicate with the Test Lead ,Team Lead or BA to check if that is a documentation issue.
       If it is a documentation issue,BA should fix the AC,and then we should update our script.(senaryo)
      -2.If it is an actual bug,then we should communicate with the team to see if ticket should be raised
       or a new story should be created,...
       */
    //SELENIUM is a web application testing tool.
    // It has method,such as getCurrent,getTitle method...That is use automation.

    //Maven is a Java build and project management tool.
    //Junit is the most basic Java testing framework

    //JUNİT
//1.JUnit is the most basic Java testing framework.
//2.Testers use JUnit to create testing framework and organize the test scripts.
//3.Developers also uses JUnit to run unit tests.
//4.We will learn TestNG framewrok as well which is the advanced vrsion of JUnit.
//5.We will also use JUnit-Cucumber framerwork to create our final testing framework.
//NOT:JUnit has similar assertions to TestNG.

//MAVEN
//1.Maven is a Java build and project management tool.
//2.With maven,you can create maven project to manage the entire automation process.
//3.Maven help us to manage the dependencies
//4.Maven help us compile,run and deploy the java applications as well.
//5.There are other tools like Ant and Gradle but maven is the most popular
//6.Owned by Apache software Foundation.

//WHY MAVEN
//1.Fast project build with maven.Maven makes project management easy.
//2.Maven downloads available jar files related to that dependency automatically.
//3.Works with multiple IDE(intellij,eclipsee,etc) and tools.
//4.Open source
//5.Large user base/forums/community

    /*What is assertion?
    -Assertion is used to check if expected equals to actual
    -Every test case must have an assertion(her test senaryosunun bir iddiası olmalıdır)
           expected = actual => PASS
           exoected != actual => FAIL
     ----------------------------------------------------------
     In JUnit Assertions class is used to do assertion(Assert class is used in JUnit5)
     Assertion.assertEquals
     Assertion.assertTrue
     Assertion.assertFalse
     Assertion.assertNull
     --------------------------------------------------------
     These assertions are HARD ASSERTS,it means if assertion fails,
     test case STOPS and do not execute the rest of that test case
        */

   /*WEBELEMENTS
    1.Anything on the webpage is called webelement
    2.Button,search box, text box,headers,tables,etc.
    3.There are different type of WebElement tags like <html>,<body>,<form>,<label>,<input>,<a>
    4.We will inspect the HTML code to identify unique web elements for automation
    5.Together they create a webpage on the UI.
    */

    /*What is a locator?
    -In automation,we have 2 steps for WebElements:
    1.Identify the element//
       -Selenium identifies the elements using locators
       -id,className,name,tagName,linktext,partialLinkText,xpath,cssSelector
    2.Perform the action//
        -click
        -type
        -submit
        -get text
        -...
    */

    /*What are the Selenium locators?
    -There are 8 selenium locators to locate an element.
      id = ATTRIBUTE
      name= ATTRIBUTE
      className = ATTRIBUTE
      tagName = TAG
      linkText = TEXT OF A LINK
      partialLinkText = PARTIAL OR FULL TEXT OF A LINK
      xpath = There are multiple combinations to write xpath
      css = There are multiple combinations to write css
     */

}
