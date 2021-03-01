import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class FirstExampes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
        System.out.println(driver.findElement(withTagName("label").above(nameEditBox)).getText());

        WebElement dateOfBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
        driver.findElement(withTagName("input").below(dateOfBirth)).sendKeys("08/05/1987");

        WebElement iceCream = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(withTagName("input").toLeftOf(iceCream)).click();

        // Get me the label of the first radio button
        WebElement rb = driver.findElement(By.id("inlineRadio1"));
        System.out.println(driver.findElement(withTagName("label").toRightOf(rb)).getText());

    }
}
