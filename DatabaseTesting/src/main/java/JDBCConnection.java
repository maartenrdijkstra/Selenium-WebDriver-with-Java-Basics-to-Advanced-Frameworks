import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) throws SQLException {
        String host = "localhost";
        String port = "3306";
        Connection conn =
                DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demo", "root", "password");
        Statement s = conn.createStatement();
        ResultSet resultSet = s.executeQuery("select * from credentials where scenario='rewardscard'");
        System.setProperty("webdriver.chrome.driver",
                "../../Selenium WebDriver with Java - Basics to Advanced + Frameworks/chromedriver");
        WebDriver driver = new ChromeDriver();
        while (resultSet.next()) {
            driver.get("https://login.salesforce.com");
            driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(resultSet.getString("username"));
            driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(resultSet.getString("password"));
        }
    }
}
