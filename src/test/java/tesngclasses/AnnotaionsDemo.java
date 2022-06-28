package tesngclasses;

import org.testng.annotations.*;

public class AnnotaionsDemo {

    @AfterTest
    public void AfterTest()
    {
        System.out.println("After Test");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test");
    }

    @AfterSuite
    public void AfterSuite()
    {
        System.out.println("After Suite");
    }
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before Suite");
    }

    @Test
    public void testcase1()
    {
        System.out.println("Test 1");
    }
    @Test
    public void testcase2()
    {
        System.out.println("Test 2");

    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("After Class");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
    }

    @AfterMethod
    public void AfterMethod()
    {
        System.out.println("After Method");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");
    }


}
