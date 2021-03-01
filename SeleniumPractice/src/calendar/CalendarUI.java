package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.xpath;

public class CalendarUI {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions");

        driver.findElement(By.id("ez-accept-all")).click();

        driver.findElement(By.xpath("//*[@id='travel_date']")).click();
//        WebDriverWait w = new WebDriverWait(driver, 2);
//        w.until(ExpectedConditions.visibilityOfElementLocated(By.
//                cssSelector("[class='datepicker-days'] [class='datepicker-switch")));
        driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch")).click();

        for (int i = 0; i < driver.findElements(By.cssSelector("[class='datepicker-months'] [class='month']")).size(); i++) {
            if (driver.findElements(By.cssSelector("[class='datepicker-months'] [class='month']"))
                    .get(i)
                    .getText()
                    .contains("Dec")) {
                driver.findElements(By.cssSelector("[class='datepicker-months'] [class='month']"))
                        .get(i)
                        .click();
            }
        }

        for (int i = 0; i < driver.findElements(By.cssSelector("[class='datepicker-days'] [class='day']")).size(); i++) {
            if (driver.findElements(By.cssSelector("[class='datepicker-days'] [class='day']"))
                    .get(i)
                    .getText()
                    .contains("31")) {
                driver.findElements(By.cssSelector("[class='datepicker-days'] [class='day']"))
                        .get(i)
                        .click();
            }
        }
    }
}
