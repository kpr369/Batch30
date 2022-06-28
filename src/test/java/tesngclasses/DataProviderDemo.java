package tesngclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @Test(dataProvider = "sendData" )
    public void login(String userName,int password)
    {
        System.out.println(userName +"\t" + password);
    }


    @DataProvider
    public Object[][] sendData()
    {
        return new Object[][]
        {
                {"Java",1},
                {"Selenium",2},
                {"Python",3},
                {"Ruby",4},
                {"C#",5}
        };
    }
}
