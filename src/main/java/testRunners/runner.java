package testRunners;

import io.appium.java_client.AppiumDriver;
import util.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions", "util"},
        plugin = {
                "summary", "pretty", "html:Reports/CucumberReport/Reports.html",
        }
)
public class runner extends AbstractTestNGCucumberTests {
    static AppiumDriver driver = DriverFactory.getDriver();
}
