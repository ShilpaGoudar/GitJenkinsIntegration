package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItemToCart {
	
	WebDriver driver;
	
	By clickMainAllMenu = By.id("HamburgerMenuDesktop");
	By womenFashionSidebarItem = By.xpath("//*[@id=\'hmenu-content\']/ul[1]/li[18]/a");
	By womenClothingSidebarItem = By.xpath("//*[@id=\'hmenu-content\']/ul[11]/li[3]/a");
	By budgetFriendlyClickImage = By.xpath("//*[@id=\'sobe_d_b_1_4\']/a/div[1]/img");
	
}
