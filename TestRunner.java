package cucumber.selenium.page;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"resourcefeature/"},
		glue = {"/cucumber/selenium/steps"},
		tags = {"@tag1"}
		)
public class TestRunner {
	
}
