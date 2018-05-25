package cucumber.selenium.steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.selenium.page.BasePage;

public class AutomationHook {
	
	@Before
	public void beforeMethod(){
		System.out.println("I am in before method to initiallize driver");
		BasePage.driver = new ChromeDriver();
		System.out.println("Webdriver initialized..");
	}
	
	@After
	public void afterMethod(){
		System.out.println("I am in after method to close the driver");
		BasePage.driver.quit();
	}
}
