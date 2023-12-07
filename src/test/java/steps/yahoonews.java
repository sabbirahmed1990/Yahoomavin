package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Homepage;

public class yahoonews extends Baseclass {
	
	//WebDriver driver;
	Homepage h1;
	
	@Given("I am on yahoo home page")
	public void i_am_on_yahoo_home_page() {
		
		launchbrowser();
		
	}

	@When("I write sport news on search box")
	public void i_write_sport_news_on_search_box() {
		
		        h1 = new Homepage(driver);
				h1.entersearch();
	    
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
		
		h1.clickbutton();
	    
	}
	
    @Then("I see relevant result")
	public void i_see_relevant_result() {
		
		h1.result();
		
		closebrowser();
				
	  }

}
