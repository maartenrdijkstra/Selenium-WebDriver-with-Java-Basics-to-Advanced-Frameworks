package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.cleartrip.com/");

        driver.findElement(By.id("Adults")).click();
        driver.findElement(By.xpath("//*[@id='Adults']/option[4]")).click();
        driver.findElement(By.id("Childrens")).click();
        driver.findElement(By.xpath("//*[@id=\"Childrens\"]/option[3]")).click();

        driver.findElement(By.id("DepartDate")).click();
        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[4]/a")).click();

        driver.findElement(By.id("MoreOptionsLink")).click();
        driver.findElement(By.id("AirlineAutocomplete")).sendKeys("KLM Royal Dutch (KL)");
        driver.findElement(By.id("SearchBtn")).click();
        Thread.sleep(1000L);
        System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
    }
}
