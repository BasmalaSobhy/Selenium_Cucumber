package TestSteps_Cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.P02_AlertPage;
import org.openqa.selenium.Alert;

import static TestSteps_Cucumber.Hooks_Cucumber.driver;

public class T02_AlertTestsUsingCucumber {
    P02_AlertPage alertPage = new P02_AlertPage();
    Alert alert;

    @Given("user goes to alert page")
    public void goToAlertPage() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @When("user clicks on ConfirmJs button")
    public void clickConfirmJSButton() throws InterruptedException {
        alertPage.clickOnJSConfirm().click();
        alert = driver.switchTo().alert();
    }

    @And("user clicks on ok on the alert")
    public void clickOkOnAlert() {
        alert.accept();
    }

    @Then("A result message will appear")
    public void getResultMessage() {
        System.out.println(alertPage.getResult().getText());
    }

    @When("user clicks on PromptJs button")
    public void clickAlertJSButton() {
        alertPage.clickOnJsPrompt().click();
        alert = driver.switchTo().alert();
    }

    @And("user sends {string}")
    public void enterText(String s) {
        alert.sendKeys(s);
    }


}
