package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(name="p")
	WebElement searchbox;
	
	public void entersearch() {
		searchbox.sendKeys("sport news");
		
	}
	
	
	@FindBy(id = "ybar-search")
	WebElement searchbutton;
	
	public void clickbutton() {
		
		searchbutton.click();
	}
	
	//WebElement searchresult = driver.findElement(By.xpath("//span[@class=' fz-14 lh-22']"));
	//searchresult.getText();
	
	@FindBy(xpath = "//span[@class=' fz-14 lh-22']")
	WebElement searchresult;
	
	public void result() {
		searchresult.getText();
		
	}
	
	
	

}
