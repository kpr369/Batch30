package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://google.com");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().to("http://facebook.com");
        Thread.sleep(3000);
        driver.navigate().back(); //Google
        Thread.sleep(3000);
        driver.navigate().forward();//facebook
        driver.close();
    }
}
