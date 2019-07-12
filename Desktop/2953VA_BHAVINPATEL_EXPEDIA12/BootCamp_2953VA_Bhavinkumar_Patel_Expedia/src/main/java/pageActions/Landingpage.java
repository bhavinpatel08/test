package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Landingpage {

    WebDriver driver;
	public Landingpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[@id='tab-flight-tab-hp']")
	WebElement Flights;
	
	
	
	
	
	public WebElement Flights()
	{
		return Flights;
	}
			
}
