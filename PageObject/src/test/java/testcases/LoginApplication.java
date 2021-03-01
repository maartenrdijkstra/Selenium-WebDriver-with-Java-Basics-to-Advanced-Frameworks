package testcases;

import objectrepository.RediffHomePage;
import objectrepository.RediffHomePagePF;
import objectrepository.RediffLoginPage;
import objectrepository.RediffLoginPagePF;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApplication {

    //Login page class implemented in normal page object pattern style
    @Test
    public void login() {
        System.setProperty("webdriver.chrome.driver", "..//..//Selenium WebDriver with Java - Basics to Advanced + Frameworks//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        RediffLoginPage rd = new RediffLoginPage(driver);
        rd.emailId().sendKeys("hello");
        rd.password().sendKeys("hello");
        rd.submit().click();
        rd.home().click();
        RediffHomePage rh = new RediffHomePage(driver);
        rh.search().sendKeys("rediff");
        rh.submit().click();
    }

    //Home page class implemented in Page object object pattern style (in this class only the use of classes differ - to see if it works -)
    @Test
    public void loginPageObject() {
        System.setProperty("webdriver.chrome.driver", "..//..//Selenium WebDriver with Java - Basics to Advanced + Frameworks//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        RediffLoginPagePF rd = new RediffLoginPagePF(driver);
        rd.emailId().sendKeys("hello");
        rd.password().sendKeys("hello");
        rd.submit().click();
        rd.home().click();
        RediffHomePagePF rh = new RediffHomePagePF(driver);
        rh.search().sendKeys("rediff");
        rh.submit().click();
    }
}
