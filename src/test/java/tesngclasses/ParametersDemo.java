package tesngclasses;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {

    @Test
    @Parameters(value = {"param1","param2"})
    public void test(String name, @Optional(value = "Test") String a)
    {
        System.out.println(name);
        System.out.println(a);
    }
}
