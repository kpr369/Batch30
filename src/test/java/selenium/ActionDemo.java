package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import util.Reusable;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ActionDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Reusable.openBrowser("firefox");
        driver.get("https://jqueryui.com/droppable/");
        Actions actions = new Actions(driver);
        Reusable.takeScreenshot(driver);
       //WebElement contribute =  driver.findElement(By.xpath("//a[text()='Contribute']"));

      // actions.moveToElement(contribute).perform();
       // actions.contextClick(contribute).perform();
       // actions.doubleClick(contribute).perform();
  /*      driver.switchTo().frame(0);
      WebElement drag =   driver.findElement(By.id("draggable"));
      WebElement drop =   driver.findElement(By.id("droppable"));
      //actions.dragAndDrop(drag,drop).perform();
        actions.clickAndHold(drag).moveToElement(drop).release(drop).perform();*/

        Thread.sleep(3000);

        //((JavascriptExecutor)driver).executeScript("window.scrollBy(0,800)");
        //((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(By.xpath("//a[text()='Show']")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].value='Automation'",
                driver.findElement(By.name("s")));
        Reusable.takeScreenshot(driver);
    }
}
