package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchPage {
	
	WebDriver driver;
	
	By searchInput = By.id("twotabsearchtextbox");
	By searchClickButton = By.id("nav-search-submit-button");
	
	public searchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void searchForItems()
	{
		driver.findElement(searchInput).sendKeys("Televisions Under 50000");
		driver.findElement(searchClickButton).click();
	}
}
