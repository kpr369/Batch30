package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://jqueryui.com/selectable/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        driver.findElement(By.xpath("//li[text()='Item 3']")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Sortable")).click();

    }
}