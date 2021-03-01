package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePagePF {

    WebDriver driver;

    public RediffHomePagePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "srchword")
    WebElement search;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submit;

    public WebElement search() {
        return search;
    }

    public WebElement submit() {
        return submit;
    }
}
