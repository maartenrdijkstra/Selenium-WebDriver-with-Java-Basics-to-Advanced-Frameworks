package miscellaneous;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AcceptCertificationsAutomatically {

    public static void main(String[] args) throws InterruptedException {

        //Automatically accept insecure certifications
        //Automatically click on proceed anyway for warning messages concerning missing ssl certificates

        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");

        DesiredCapabilities ch = DesiredCapabilities.chrome();
//        ch.acceptInsecureCerts();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        ChromeOptions c = new ChromeOptions();
        c.merge(ch);
        WebDriver driver = new ChromeDriver(c);
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");


    }
}
