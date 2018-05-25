package cucumber.selenium.steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:/Workspace/selenium_cucumber/src/main/java/resourcefeature/"},
		glue = {"cucumber.selenium.steps"},
		tags = {"@tag1"},
		plugin = {"html:target/report/cucumber-html", "json:target/cucumber.json"}
		)
public class TestRunner {
	
}
