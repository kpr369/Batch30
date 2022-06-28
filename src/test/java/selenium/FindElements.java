package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.apsrtclogistics.in/Counteruser/Account/Track_awb");
       List<WebElement> menu=  driver.findElements(By.xpath("(//ul)[1]/li/a"));
       for(WebElement ele : menu)
       {
           System.out.println(ele.getText());
       }
    }
}
