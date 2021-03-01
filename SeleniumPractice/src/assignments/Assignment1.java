package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());

        driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
        Assert.assertFalse(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());

        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
    }
}
