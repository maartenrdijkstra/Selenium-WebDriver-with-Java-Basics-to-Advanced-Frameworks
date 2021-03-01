package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

import static java.lang.Integer.parseInt;

public class Scrolling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=150");
        List<WebElement> values = driver.findElements(By.cssSelector((".tableFixHead td:nth-child(4)")));

        int sum = values.stream().mapToInt(value -> parseInt(value.getText())).sum();
        System.out.println(sum);

        int total = Integer.parseInt(driver.findElement((By.cssSelector(".totalAmount"))).getText().split(":")[1].trim());
        Assert.assertEquals(sum, total);
    }
}
