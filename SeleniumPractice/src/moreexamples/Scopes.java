package moreexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.stream.IntStream;

public class Scopes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());
        WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size());

        IntStream.range(1, columnDriver.findElements(By.tagName("a")).size()).forEach(i -> {
            String clickOnLinkTab = Keys.chord(Keys.COMMAND, Keys.RETURN);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        Set<String> handles = driver.getWindowHandles();

        handles.forEach(handle -> {
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());
        });
    }
}
