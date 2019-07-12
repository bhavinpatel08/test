package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage {

	WebDriver driver;
	public FlightsPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[@id='flight-type-roundtrip-label-hp-flight']")
	WebElement Roundtrip;
	
	@FindBy(xpath="//input[@id='flight-origin-hp-flight']")
	WebElement Flayingfrom;
	
	@FindBy(xpath="//input[@id='flight-destination-hp-flight']")
	WebElement Flayingto;
	
	@FindBy(xpath="//input[@id='flight-departing-hp-flight']")
	WebElement SelectDepartureDate;

	@FindBy(xpath="//caption[@class='datepicker-cal-month-header']")
	WebElement Month;
	
	@FindBy(xpath="//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']")
	WebElement selectmonth;
	

	@FindBy(xpath="(//button[@data-day='25'])[1]")
	WebElement Date;
	
	@FindBy(xpath="//input[@id='flight-returning-hp-flight']")
	WebElement SelectReturningDate;
	

	@FindBy(xpath="//button[@data-day='23']")
	WebElement Date1;
	
	@FindBy(xpath="(//button[@class='btn-primary btn-action gcw-submit'])[1]")
	WebElement Search;
	
	public WebElement Roundtrip()
	{
		return Roundtrip;
	}
	
	public WebElement Flayingfrom()
	{
		return Flayingfrom;
	}
	
	public WebElement Flayingto()
	{
		return Flayingto;
	}
	public WebElement SelectDepartureDate()
	{
		return SelectDepartureDate;
	}
	public WebElement Month()
	{
		return Month;
	}
	public WebElement selectmonth()
	{
		return selectmonth;
	}
	public WebElement Date()
	{
		return Date;
	}
	
	public WebElement SelectReturningDate()
	{
		return SelectReturningDate;
	}
	public WebElement Date1()
	{
		return Date1;
	}
	public WebElement Search()
	{
		return Search;
	}
	
}
