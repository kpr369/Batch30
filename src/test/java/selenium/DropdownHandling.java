package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

     /*   Select select = new Select(driver.findElement(By.xpath("//select[@id='first']")));
        System.out.println(select.isMultiple());
        //select.selectByIndex(3);
        select.selectByValue("Apple");
       // select.selectByVisibleText("Bing");
        select.deselectByVisibleText("Iphone");*/

        Select select = new Select(driver.findElement(By.xpath("//select[@id='second']")));
        System.out.println(select.isMultiple());

        select.selectByIndex(2);
        select.selectByIndex(3);
        Thread.sleep(3000);
       // select.deselectByIndex(3);
       // select.deselectAll();

       for(WebElement ele : select.getOptions())
       {
           System.out.println(ele.getText());


       }

        System.out.println("---------------------");

       for(WebElement ele1 :select.getAllSelectedOptions())
       {
           System.out.println(ele1.getText());
       }
        System.out.println("---------------");

        System.out.println(select.getFirstSelectedOption().getText());
    }
}
