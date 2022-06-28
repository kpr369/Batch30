package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DCapabilites {

    public static void main(String[] args) {

        ChromeOptions co = new ChromeOptions();
        co.addArguments("start-maximized");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(co);

        driver.get("https://compressjpeg.com/");

        driver.findElement(By.id("fileSelector")).sendKeys("C:\\Users\\Purushothama_Kurnool\\Downloads\\WhatsApp Image 2022-06-07 at 1.02.32 PM.jpeg");
    }
}
