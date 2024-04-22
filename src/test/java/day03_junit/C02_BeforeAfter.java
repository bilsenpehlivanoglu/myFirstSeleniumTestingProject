package day03_junit;

import org.junit.jupiter.api.*;

public class C02_BeforeAfter {

    @BeforeAll
    static void beforeAll() {
        System.out.println("classtaki tüm test methodlarından once");
    }

    @BeforeEach
    void setUp() {
        System.out.println("herbir test methodundan önce");
    }

    @Test @Disabled
    void test01() {
        System.out.println("test1 calıstı");
    }

    @Test
    void test02() {
        System.out.println("test2 calıstı");
    }

    @Test
    void test3() {
        System.out.println("test3 calıstı");
    }

    @AfterEach
    void tearDown() {
        System.out.println("her bi test methodun altında");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("tüm test methodların altında");
    }

}
