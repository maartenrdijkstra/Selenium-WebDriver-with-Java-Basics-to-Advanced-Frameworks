package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://facebook.com");
        driver.findElement(By.cssSelector("#email")).sendKeys("This is my first code");
        driver.findElement(By.name("pass")).sendKeys("123456");

        driver.findElement(By.xpath("//button[@title='Accept All']")).click();

        driver.findElement(By.linkText("Forgotten password?")).click();
    }

}
