package Javarunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Cucumber",
        glue = "Steps",
        tags = "@login",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        },
        monochrome = true
)

public class FlikartOTP extends AbstractTestNGCucumberTests {
}