package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //tells junit to run this class as cucumber test
@CucumberOptions(
        features = "src/main/resources/Features",  // location (path from content root) of the folder features files
        glue = {"TestSteps_Cucumber"},   // name of the folder of test steps
        plugin = {"pretty",             // the report
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        tags = "@regression" // tags represent test collections >> note: tags are caseSensitive
        // if you want to run all the project remove the tags line
)
public class TestRunner {

}