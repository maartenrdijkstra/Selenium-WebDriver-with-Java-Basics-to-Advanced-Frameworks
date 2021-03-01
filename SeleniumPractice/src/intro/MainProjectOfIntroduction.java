package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MainProjectOfIntroduction {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://spicejet.com/");
        // driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // FROM
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        // TO
        Thread.sleep(2000L);
//        driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();


        //DEPART DATE
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        // Round trip enable return date
//        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
            System.out.println("Return date is enabled");
            Assert.assertTrue(true);
        } else {
            System.out.println("Return date is disabled");
            Assert.assertTrue(false);
        }

        //One way trip disable return date
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
            System.out.println("Return date is disabled");
            Assert.assertTrue(true);
        } else {
            System.out.println("Return date is enabled");
            Assert.assertTrue(false);
        }

        // PASSENGERS
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000L);
        driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']/option[5]")).click();

        driver.findElement(By.id("divpaxinfo")).click();

        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

        /*
        //https://rahulshettyacademy.com/dropdownsPractise

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

        */

        // SENIOR CITIZEN DISCOUNT
        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());

        // CLICK SEARCH BUTTON
        driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
        /*
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        driver.findElement(By.name("ctl00_mainContent_btn_FindFlights")).click();
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        */
    }
}
