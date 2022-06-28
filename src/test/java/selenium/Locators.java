package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://google.com");
     /*  WebElement ele = driver.findElement(By.tagName("input"));
       ele.sendKeys("Automation");*/
        driver.findElement(By.xpath("//a[text()='Gmail']")).click();
    }
}
