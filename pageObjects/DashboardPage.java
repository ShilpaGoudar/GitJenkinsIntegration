package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	
	WebDriver driver;
	
	By searchItems = By.id("twotabsearchtextbox");
	By searchIcon = By.id("nav-search-submit-button");
	
	By countryLanguage = By.id("icp-nav-flyout");
	By radioSelectLang = By.xpath("//*[@id=\"icp-language-settings\"]/div[2]/div/label/i");
	By saveChanges = By.id("icp-save-button");
	By accountSignIn = By.xpath("//*[@id=\'nav-link-accountList\']");
	By signIn = By.id("nav-flyout-ya-signin");
	By createAccountStartHere = By.xpath("//*[@id=\'nav-flyout-ya-newCust\']/a");
	
	public DashboardPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void searchItemInput()
	{
		driver.findElement(searchItems).sendKeys("Mobiles Under 30000");
		driver.findElement(searchIcon).click();
	}
	public void selectCountryLanguage()
	{
		driver.findElement(countryLanguage).click();
		driver.findElement(radioSelectLang).click();
		driver.findElement(saveChanges).click();
	}
	
	public void clickCreateAccountButton()
	{
		Actions findStartHere = new Actions(driver);
		findStartHere.moveToElement(driver.findElement(accountSignIn)).perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Start here.")));
		driver.findElement(createAccountStartHere).click();
	}
	
	public void clickLoginPage()
	{
		Actions findSignIn = new Actions(driver);
		findSignIn.moveToElement(driver.findElement(accountSignIn)).perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign in")));
		driver.findElement(signIn).click();
		
	}

}
