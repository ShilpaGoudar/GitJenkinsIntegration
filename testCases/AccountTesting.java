package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CreateAccountPage;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;

public class AccountTesting{
	
	WebDriver driver;
	
	LoginPage LoginPageObject;
	DashboardPage DashboardPageObject;
	CreateAccountPage CreateAccountPageObject;
	
	@BeforeTest
	public void InitializeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
	}
	
	@Test(priority=0)
	public void selectCountryLanguage() throws Exception
	{
		DashboardPageObject = new DashboardPage(driver);
		DashboardPageObject.selectCountryLanguage();
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void gotoLogInPage()
	{
		DashboardPageObject = new DashboardPage(driver);
		DashboardPageObject.clickLoginPage();
	}
	@Test(priority=2)
	public void loginToUrl()
	{
		LoginPageObject = new LoginPage(driver);
		LoginPageObject.signInCredentials();
	}
	
	@Test(priority=10)
	public void createAccountPage()
	{
		DashboardPageObject = new DashboardPage(driver);
		DashboardPageObject.clickCreateAccountButton();
	}
	
	@Test(priority=11)
	public void createAccount()
	{
		CreateAccountPageObject = new CreateAccountPage(driver);
		CreateAccountPageObject.createAccount();
	}

	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
