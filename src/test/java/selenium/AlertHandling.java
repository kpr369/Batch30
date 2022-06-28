package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class AlertHandling {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.apsrtconline.in/oprs-web/");

        driver.findElement(By.id("searchBtn")).click();

       //alert
       Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        driver.findElement(By.name("source")).sendKeys("Automation");
    }
}