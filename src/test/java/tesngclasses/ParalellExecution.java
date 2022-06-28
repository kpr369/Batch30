package tesngclasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.Reusable;

public class ParalellExecution {

    @Test
    public void test1()
    {
        WebDriver driver = Reusable.openBrowser("Chrome");
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
    }
    @Test
    public void test2()
    {
       WebDriver driver = Reusable.openBrowser("Chrome");
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
    }
    @Test
    public void test3()
    {
       WebDriver driver = Reusable.openBrowser("Chrome");
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

    }
}
