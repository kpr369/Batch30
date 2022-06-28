package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Reusable {
    public static WebDriver driver;

    /**
     * @param browser
     * @return Webdriver
     * @Author : Purushothama Reddy K
     * This method invokes new Broswer
     */
    public static WebDriver openBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions co = new ChromeOptions();
            co.addArguments("start-maximized");
            driver = new ChromeDriver(co);
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            if (browser.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

    public static void takeScreenshot(WebDriver driver) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenshot = ts.getScreenshotAs(OutputType.FILE); //temp location
        screenshot.renameTo(new File("C:\\TT\\screenshot" + new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss_SS").format(new Date()) + ".jpeg"));
    }
}
