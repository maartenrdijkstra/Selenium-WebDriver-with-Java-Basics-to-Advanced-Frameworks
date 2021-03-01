package seleniumgrid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteTest {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");
        dc.setPlatform(Platform.MAC);
//        dc.setVersion();

        // Webdriver driver = new ChromeDriver();
        WebDriver driver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"), dc);
        driver.get("http://www.google.com");
    }
}
