package streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsWithSelenium {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");

        // click on column
        driver.findElement(By.xpath("//tr/th[1]")).click();

        // capture all webElements into list
        List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));

        // capture text of all webElements into new(original) list
        List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());

        // sort on the original list of step 3 -> sorted list
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

        // compare original list vs sorted list
        Assert.assertTrue(originalList.equals(sortedList));

        List<String> price;
        // scan the name column with getText -> Beans -> print the price of the Beans
        do {
            List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
            price = rows.stream()
                    .filter(s -> s.getText().contains("Rice"))
                    .map(s -> getPriceVeggie(s))
                    .collect(Collectors.toList());
            price.forEach(System.out::println);
            if (price.size() < 1) {
                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }

        } while (price.size() < 1);
    }

    private static String getPriceVeggie(WebElement s) {
        return s.findElement(By.xpath("following-sibling::td[1]")).getText();
    }
}
