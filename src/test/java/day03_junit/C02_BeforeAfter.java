package day03_junit;

import org.junit.jupiter.api.*;

public class C02_BeforeAfter {

    /*1.@Test: This is used to create TEST CASES.
    This is one of teh most common annotation that we will use
    Note that all test methods should be void
    2.@BeforeAll and @AfterAll runs only ONCE before or after each CLASS
    3.@BeforeEach and @AfterEach runs only ONCE before or after each METHOD
    4.@Disable is used to ignore/skip a test case
    */
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All...");
    }

    @BeforeEach
    void setUpMethods() {
        System.out.println("Before Each...");
    }


    @Test @Disabled
    void test01() {
        System.out.println("Test Case 1...");
    }

    @Test
    void test02() {
        System.out.println("Test Case 2...");
    }

    @Test
    void test3() {
        System.out.println("Test Case 3...");
    }

    @Test
    void test4() {
        System.out.println("Test Case 4...");
    }

    @AfterEach
    void tearDownMethods() {
        System.out.println("After Each...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All...");
    }

}
