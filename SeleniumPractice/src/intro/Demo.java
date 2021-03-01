package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
        driver.get("http://yahoo.com");
//        driver.navigate().back();
//        driver.navigate().forward();
        driver.close(); // closes current browser
        driver.quit(); // closes all the browsers opened by selenium script
    }
}
