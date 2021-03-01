package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        System.out.println(driver.findElements(By.tagName("iframe")).size());
//        driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        WebElement element = driver.findElement(By.id("draggable"));
        Actions a = new Actions(driver);
        a.dragAndDrop(element, driver.findElement(By.id("droppable"))).build().perform();
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("a[href='/resources/demos/droppable/accepted-elements.html']")).click();
    }
}
