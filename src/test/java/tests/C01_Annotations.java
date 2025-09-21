package tests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C01_Annotations {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @Test
    public void test01() {
        System.out.println("Test 01");
    }

    @Test
    public void test02() {
        System.out.println("Test 02");
    }
    @Test
    public void test03() {
        System.out.println("Test 03");
    }
    @Test
    public void test04() {
        System.out.println("Test 04");
    }
    @Test
    public void test05() {
        System.out.println("Test 05");
    }




}
