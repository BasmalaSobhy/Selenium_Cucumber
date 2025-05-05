package TestSteps_Cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks_Cucumber {
    public static WebDriver driver;
    /* Cucumber Annotations

        @Before >> To run before each scenario
        @After >> To run after each scenario

     */

    @Before
    public void openBrowser2() {
        System.out.println("BeforeMethod");

        driver = new ChromeDriver();
    }

    @After
    public void closeBrowser2() {
        System.out.println("AfterMethod");
        //driver.close();
        driver.quit();
    }
}
