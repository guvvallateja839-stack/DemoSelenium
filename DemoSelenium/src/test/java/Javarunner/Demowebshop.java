package Javarunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	import org.junit.runner.RunWith;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	        features = "src/test/resources/Cucumber",
	        glue = "Steps",
	        tags = "@commerce",
	          plugin = {
	                "pretty",
	                "html:target/cucumber-report.html"
	        },
	        monochrome = true
	)
	public class Demowebshop {
	}


