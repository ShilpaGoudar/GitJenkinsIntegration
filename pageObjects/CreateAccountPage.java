package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {
	
	WebDriver driver;
	
	By enterYourName = By.id("ap_customer_name");
	By enterModileNumber = By.id("ap_phone_number");
	By enterEmail = By.id("ap_email");
	By enterPassword = By.id("ap_password");
	By clickContinueButton = By.className("a-button-input");
	By createAccountExistingNumber = By.className("a-popover-trigger a-declarative auth-continue-create-account-action");
	By createAccountAnyway = By.id("auth-account-conflict-continue-verify-url");
	
	public CreateAccountPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void createAccount()
	{
		driver.findElement(enterYourName).sendKeys("Shilpa Goudar");
		driver.findElement(enterModileNumber).sendKeys("8147556436");
		driver.findElement(enterEmail).sendKeys("shilifepunu@gmail.com");
		driver.findElement(enterPassword).sendKeys("Punu@life123");
		driver.findElement(clickContinueButton).click();
		driver.findElement(createAccountExistingNumber).click();
		driver.findElement(createAccountAnyway).click();
	}
}
