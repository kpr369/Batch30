package selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SeleniumFirstProgram {

    public static void main(String[] args) {

       // System.setProperty("webdriver.chrome.driver","C:\\Users\\Purushothama_Kurnool\\Desktop\\T\\chromedriver_win32\\chromedriver.exe");
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(); // Chrome Broswer
        driver.manage().window().maximize();
        driver.get("https://facebook.com");


        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
          }
}
