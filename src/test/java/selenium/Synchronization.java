package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Reusable;

import java.time.Duration;

public class Synchronization {

    public static void main(String[] args) {

        WebDriver driver = Reusable.openBrowser("edge");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//fail
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        driver.get("https://google.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("asadfasdfas")));

        driver.findElement(By.id("safda"));

    }
}
