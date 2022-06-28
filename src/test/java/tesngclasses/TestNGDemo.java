package tesngclasses;

import org.testng.annotations.Test;

public class TestNGDemo {

    @Test(priority = 0, description = "This is a testng Method", dependsOnMethods = "HomePage", alwaysRun = true) //5 times
    public void loginPage() throws InterruptedException //Testcase
    {
        System.out.println("Login");
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void HomePage()
    {
        System.out.println("Home");
        System.out.println(5/0);
    }
}
