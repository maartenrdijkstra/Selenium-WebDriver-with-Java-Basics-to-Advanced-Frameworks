package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElements(By.cssSelector("#product[class='table-display'] tr")).size());
        System.out.println(driver.findElements(By.cssSelector("#product[class='table-display'] tr:nth-child(2) td")).size());

        List<WebElement> row = driver.findElements(By.cssSelector("#product[class='table-display'] tr:nth-child(3) td"));
        row.forEach(column -> System.out.println(column.getText()));
    }
}
