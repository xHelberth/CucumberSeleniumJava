package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.westernUnionPage;

public class Example1Steps {

	WebDriver driver = null;
	westernUnionPage mainPage;
		@Given("open browser")
		public void open_browser() {
			
		   System.out.println("Inside step - open browser");
		   String projectPath = System.getProperty("user.dir");
		   System.out.println("Project path is: "+projectPath);
		   System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		   
		   driver = new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   mainPage = new westernUnionPage(driver);
		}
		@Given("visit web site Western Union")
		public void visit_web_site_western_union() {
		   driver.navigate().to("https://www.westernunion.com/lt/en/home.html");

		}
		@And("expand burger menu")
		public void expand_burger_menu() throws InterruptedException{
		   Thread.sleep(3000);
		   mainPage.selectBurgerMenu();
		}
		@When("select settings page")
		public void select_settings_page() {
			mainPage.selectOption();
		}
		@And("open select countries")
		public void open_select_countries() {
			mainPage.selectLocation();
		}
		@And("change country to United States")
		public void change_country_to_united_states() {
			mainPage.selectCountry();

		}
		@And("confirm your choice")
		public void confirm_your_choice() {
			mainPage.confirmOption();
		}
		@Then("the correct country page was loaded.")
		public void the_correct_country_page_was_loaded() {
			
			driver.getPageSource().contains("Send money 24/7 around the world with Western Union");
			driver.close();
			driver.quit();
		}
}
