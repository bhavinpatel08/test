package Select_Flights;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import baseProperties.BaseClass;
import pageActions.Landingpage;
import pageActions.Passenger_Info_Page;
import pageActions.SearchPage;
import pageActions.SelectFlightPage;
import pageActions.FlightsPage;

public class Verify_the_Select_Flight_Functionality extends BaseClass{
	
	Landingpage lp;
	FlightsPage fp;
	SearchPage sp;
	SelectFlightPage sfp;
	Passenger_Info_Page pi;
	
	
	@BeforeClass
	public void SetUpBrowser() throws IOException
	{
		Invo();
	}
	
	@Test
	public void Velidate_Select_Flidht() throws InterruptedException 
	{
		lp=new Landingpage(driver);
		Thread.sleep(2000);
		lp.Flights().click();
		Thread.sleep(2000);
		fp=new FlightsPage(driver);
		fp.Roundtrip().click();
		fp.Flayingfrom().click();
		fp.Flayingfrom().sendKeys("ahmed");
		Thread.sleep(2000);
		fp.Flayingfrom().sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER));
		Thread.sleep(2000);
		fp.Flayingto().click();
		fp.Flayingto().sendKeys("iad");
		fp.Flayingto().sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER));
		Thread.sleep(5000);
		fp.SelectDepartureDate().click();
		Thread.sleep(2000);
		fp.Date().click();
		fp.SelectReturningDate().click();
		fp.Date1().click();
		Thread.sleep(2000);
		fp.Search().click();
		Thread.sleep(4000);
		sp=new SearchPage(driver);
		//String link=Keys.chord(Keys.CONTROL,Keys.ENTER);
		//driver.findElement(By.xpath("//button[@data-offer-index='5']")).sendKeys(link);
		//sp.Select().sendKeys(link);
		sp.Select().click();
		sp.Select().click();
		Thread.sleep(4000);
		System.out.println("abcd");
		if(sp.pop()>0)
		{
			System.out.println(sp.pop());
			Thread.sleep(2000);
			sp.popup().click();
		}
		sfp=new SelectFlightPage(driver);
		Thread.sleep(2000);
		sfp.HandelWindow();
		Thread.sleep(2000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500)");
		sfp.Contenue_Booking().click();
		Thread.sleep(2000);
		pi=new Passenger_Info_Page(driver);
		pi.FirstName().sendKeys("Bhavin");
		pi.MiddelName().sendKeys("j");
		pi.LastName().sendKeys("patel");
		pi.Select_country_code();
		pi.Phone().sendKeys("1234567892");
		Thread.sleep(2000);
		pi.Chekboxph().click();
		Thread.sleep(2000);
		pi.PassPort();
		Thread.sleep(2000);
		pi.Gender().click();
		Thread.sleep(2000);
		pi.Month();
		Thread.sleep(2000);
		pi.Day();
		Thread.sleep(2000);
		pi.Year();
		Thread.sleep(2000);
		
		
		
		
		/*String m=fp.Month().getText();
		System.out.println(m);
		while(!m.equalsIgnoreCase("Aug 2019"))
		{
			System.out.println(m);
			fp.selectmonth().click();
			
			if(m.equalsIgnoreCase("Aug 2019"))
			{
				break;
			}*/
		}
			
	
	

    @AfterClass
	public void tearDown()
	{
		driver.close();
		
	}
}
