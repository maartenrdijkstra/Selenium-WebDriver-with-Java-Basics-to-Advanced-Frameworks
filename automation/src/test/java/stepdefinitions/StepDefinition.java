package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {


    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() {
        // code to navigate login url
        System.out.println("Navigated to login url");
        //driver.get("http://bank.com")
    }

    @When("^User logs into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logs_into_application_with_something_and_password_something(String username, String password) {
        System.out.println(username);
        System.out.println(password);
//        driver.findElement(By.xpath("").sendKeys(username));
//        driver.findElement(By.xpath("").sendKeys(password));
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() {
        // home page validation
        System.out.println("Validated homepage");
//        Assert.assertThat(driver.findElement(By.cssSelector("").isDisplayed));
    }

    @Then("Cards displayed are {string}")
    public void cards_displayed_are(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards displayed? " + string);
//        Assert.assertThat(driver.findElement(By.id("cards").isDisplayed));

    }


}
