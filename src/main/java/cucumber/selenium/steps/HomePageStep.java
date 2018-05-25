package cucumber.selenium.steps;

import java.sql.Driver;

import cucumber.api.java.en.Given;
import cucumber.selenium.page.HomePage;

public class HomePageStep {
	HomePage homePage = new HomePage();
	
	@Given("^I am on home page$")
	public void i_am_on_home_page() throws Throwable {
	    System.out.println("I am on home page");
	    homePage.navigateOnhomePage();
	}
	
	@Given("^I enter city name on home page$")
	public void i_enter_city_name_on_home_page() throws Throwable {
	    homePage.enterCity();
	}
	
	@Given("^I verify email id is present on home page$")
	public void i_verify_email_id_is_present_on_home_page() throws Throwable {
	    homePage.verifyEmailAddress();
	}
	@Given("^I click on \"([^\"]*)\"$")
	public void i_click_on(String clickElement) throws Throwable {
		Thread.sleep(5000);
		homePage.clickOnElement(clickElement);
	}
	@Given("^I verify text \"([^\"]*)\" is present$")
	public void i_verify_text_is_present(String text) throws Throwable {
		homePage.verifyText(text);
	}
}
