package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Passenger_Info_Page {
	

    WebDriver driver;
	public Passenger_Info_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='firstname[0]']")
	WebElement FirstName;
	

	@FindBy(xpath="//input[@id='middlename[0]']")
	WebElement MiddelName;
	

	@FindBy(xpath="//input[@id='lastname[0]']")
	WebElement LastName;
	
	@FindBy(xpath="//select[@id='country_code[0]']")
	WebElement CountryCode;
	
	@FindBy(xpath="//input[@id='confirmation-sms-provider-checkbox']")
	WebElement Chekboxph;
	
	@FindBy(xpath="//input[@id='phone-number[0]']")
	WebElement Phone;
	
	@FindBy(xpath="//select[@id='passport[0]']")
	WebElement PassPort;
	
	@FindBy(xpath="//input[@id='gender_male[0]']")
	WebElement Gender;
	
	@FindBy(xpath="//select[@id='date_of_birth_month0']")
	WebElement Month;
	
	@FindBy(xpath="//select[@id='date_of_birth_day[0]']")
	WebElement Day;
	
	@FindBy(xpath="//select[@id='date_of_birth_year[0]']")
	WebElement Year;
	
	public WebElement FirstName()
	{
		return FirstName;
	}
	
	public WebElement MiddelName()
	{
		return MiddelName;
	}
	
	
	public WebElement LastName()
	{
		return LastName;
	}
	public void Select_country_code()
	{
		Select s=new Select(CountryCode);
		s.selectByValue("91");
		
	}
	
	public WebElement Chekboxph()
	{
		return Chekboxph;
	}
	public WebElement Phone()
	{
		return Phone;
	}
	public void PassPort()
	{
		Select s=new Select(PassPort);
		s.selectByValue("4476489");
		
	}
	public WebElement Gender()
	{
		return Gender;
	}
	public void Month()
	{
		Select s=new Select(Month);
		s.selectByValue("08");
	}
	public void Day()
	{
		Select s=new Select(Day);
		s.selectByValue("08");
	}
	public void Year()
	{
		Select s=new Select(Year);
		s.selectByValue("1992");
	}
	
}
