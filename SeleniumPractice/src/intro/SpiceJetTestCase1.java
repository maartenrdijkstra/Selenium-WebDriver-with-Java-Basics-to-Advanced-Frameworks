package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SpiceJetTestCase1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://spicejet.com");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000L);
//        driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

//        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

//        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
            System.out.println("Return date is enabled");
            Assert.assertTrue(true);
        } else {
            System.out.println("Return date is disabled");
            Assert.assertTrue(false);
        }

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
            System.out.println("Return date is disabled");
            Assert.assertTrue(true);
        } else {
            System.out.println("Return date is enabled");
            Assert.assertTrue(false);
        }

//        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
    }
}
