package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        int index = 2;

        driver.findElement(By.id("checkBoxOption" + index)).click();
        String label = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[" + index + "]")).getText();
        driver.findElement(By.id("name")).sendKeys(label);
        driver.findElement(By.id("alertbtn")).click();
        String grabbedText = driver.switchTo().alert().getText().split("Hello ")[1].split(",")[0];
        System.out.println(grabbedText);
        System.out.println("Does the grabbed text equal the label? " + grabbedText.equals(label));
    }
}
