package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.searchPage;

public class MainScriptTest {

	WebDriver driver;
	
	searchPage searchPageObject;
	
	@BeforeTest
	public void InitializeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
	}
	
	@Test
	public void searchForItems()
	{
		searchPageObject = new searchPage(driver);
		searchPageObject.searchForItems();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	

}
