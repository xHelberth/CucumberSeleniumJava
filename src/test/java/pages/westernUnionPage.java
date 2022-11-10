package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class westernUnionPage {
	
	WebDriver driver;

	By burger_menu_wu = By.className("hamburger-button");
	By option_menu_setting_wu = By.xpath("(//a[@href='/lt/en/account/app/settings'][contains(.,'Settings')])[1]");
	By select_location_wu = By.id("Question");
	By option_menu_location_wu = By.xpath("//option[@label='United States']");
	By select_option_wu = By.xpath("//button[@ng-click='redirect();']");
	
	public westernUnionPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectBurgerMenu() {
		this.driver.findElement(burger_menu_wu).click();
	}
	public void selectOption() {
		this.driver.findElement(option_menu_setting_wu).click();
	}
	public void selectLocation() {
		this.driver.findElement(select_location_wu).click();
	}
	public void selectCountry() {
		this.driver.findElement(option_menu_location_wu).click();	
	}
	public void confirmOption() {
		this.driver.findElement(select_option_wu).click();
	}
}
