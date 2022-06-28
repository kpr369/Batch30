package tesngclasses;

import org.testng.annotations.Test;

public class GroupsDemo {


    @Test(groups = "regression")
    public void test1()
    {
        System.out.println("Regression");
    }
    @Test(groups = "sanity")
    public void test2()
    {
        System.out.println("Sanity");
    }
    @Test(groups = "smoke")
    public void test3()
    {
        System.out.println("Smoke");
    }
    @Test(groups = {"smoke,sanity"})
    public void test4()
    {
        System.out.println("Sanity and Smoke");
    }
}
