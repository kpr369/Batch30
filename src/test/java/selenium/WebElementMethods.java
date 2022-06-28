package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        WebElement fistName = driver.findElement(By.name("firstname"));
        fistName.sendKeys("Automation");
        Thread.sleep(3000);
        fistName.clear();
        System.out.println(fistName.getAttribute("style"));
        System.out.println(fistName.getTagName());
        System.out.println(fistName.getCssValue("width"));
        WebElement sex_male = driver.findElement(By.xpath("//input[@value='Male']"));
        System.out.println(sex_male.isSelected());
        sex_male.click();
        System.out.println(sex_male.isSelected());
        System.out.println(driver.findElement(By.name("submit")).getText());
        System.out.println(driver.findElement(By.name("submit")).isEnabled());
        System.out.println(driver.findElement(By.name("submit")).isDisplayed());
    }
}
