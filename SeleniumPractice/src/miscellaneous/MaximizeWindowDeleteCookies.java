package miscellaneous;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;

public class MaximizeWindowDeleteCookies {
    public static void main(String[] args) throws IOException {
        DesiredCapabilities ch = DesiredCapabilities.chrome();
//        ch.acceptInsecureCerts();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        ChromeOptions c = new ChromeOptions();
        c.merge(ch);
        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");
        WebDriver driver = new ChromeDriver(c);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
//        driver.manage().deleteCookieNamed("asdf");
//        driver.manage().addCookie();

        //session
//        driver.manage().deleteCookieNamed("sessionKey");

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("./screenshot.jpg"));
    }
}
