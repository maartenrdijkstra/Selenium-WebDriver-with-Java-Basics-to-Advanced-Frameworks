package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class BrokenLink {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        // broken URL
        // Step 1 - Get all urls tied up to the links using Selenium
        String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");

        // Step 2 - Java methods will call URLs and get you the status code
        HttpURLConnection conn = (HttpURLConnection) new URL (url).openConnection();

        // Step 3 - If status code > 400 then that url is not working -> link which is tied to to url is broken
        conn.setRequestMethod("HEAD");
        conn.connect();
        int responseCode = conn.getResponseCode();
        System.out.println(responseCode);

    }
}
