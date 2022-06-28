package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");

        driver.findElement(By.id("newWindowBtn")).click();

       String activeWindowName = driver.getWindowHandle();
       Set<String> allWindows = driver.getWindowHandles();

       for(String s: allWindows)
       {
          /*if(s.equalsIgnoreCase(activeWindowName))
           {

           }else
           {
               driver.switchTo().window(s);
               break;
           }*/

           driver.switchTo().window(s);
           if(driver.getTitle().contains("Basic Controls"))
           {
               break;
           }
       }
        driver.findElement(By.id("firstName")).sendKeys("Automation");
    }
}