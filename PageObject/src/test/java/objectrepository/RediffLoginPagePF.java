package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {

    WebDriver driver;

    public RediffLoginPagePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//*[@id='login1']" )
    WebElement username;

    @FindBy(name = "passwd")
    WebElement password;

    @FindBy(name = "proceed")
    WebElement go;

    @FindBy(className = "f12")
    WebElement home;

    public WebElement emailId() {
        return username;
    }

    public WebElement password() {
        return password;
    }

    public WebElement submit() {
        return go;
    }

    public WebElement home() {
        return home;
    }
}
