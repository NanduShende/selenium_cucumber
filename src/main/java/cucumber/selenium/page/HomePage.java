package cucumber.selenium.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
	WebElement emailOnHeader;
	WebElement offerTab;
	WebElement carTab;
	WebElement dubaiTextTab;
	
	public void navigateOnhomePage(){
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/");		
	}

	public void enterCity() throws InterruptedException {
		WebElement cityTextBox = driver.findElement(By.id("citiesInput")); 
		Thread.sleep(4000);
		cityTextBox.sendKeys("Pune");		
		Thread.sleep(2000);
	}

	public void verifyEmailAddress() {
		
		emailOnHeader.getText();
		Assert.assertTrue("Email address is not present on home page",emailOnHeader.getText().equalsIgnoreCase("info@levilova.com"));
		
	}

	public void clickOnElement(String clickElement) {
		offerTab = driver.findElement(By.xpath("//img[@src='https://www.phptravels.net/themes/default/assets/img/icons/offers.png']"));
		carTab = driver.findElement(By.xpath("//img[@src='https://www.phptravels.net/themes/default/assets/img/icons/car.png']"));
		if(clickElement.equalsIgnoreCase("offer tab")){
			offerTab.click();
		}else if(clickElement.equalsIgnoreCase("car tab")){
			carTab.click();
		}
		
	}
	public void verifyText(String text) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		dubaiTextTab = driver.findElement(By.xpath("//h4[contains(text(),'Dubai Special Packages')]"));
		if(text.equalsIgnoreCase("Dubai Special Packages")){
			Assert.assertTrue("Email address is not present on home page",dubaiTextTab.getText().equalsIgnoreCase("Dubai Special Packages"));
		}
		
	}
}
