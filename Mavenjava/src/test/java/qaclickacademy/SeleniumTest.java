package qaclickacademy;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class SeleniumTest {

	//testng xml file from Maven
	// how to execute all test cases from Test folder  - mvn test
	@Test
	public void BrowserAUtomation()
	{
		System.out.println("BrowserAUtomation");	
	}
	@Test
	public void elementsUi()
	{
		System.out.println("elementsUi");	
	}
	@Test
	public void semple() throws IOException
	{
		Properties pro=new Properties();
		FileInputStream fil=new FileInputStream("C:\\Users\\mail2\\Mavenjava\\src\\test\\java\\qaclickacademy\\king.properties");
		pro.load(fil);
		System.out.println(pro.getProperty("url"));	
		System.out.println(pro.getProperty("password"));
		System.out.println(pro.getProperty("a"));	
		System.out.println("url");	
	}
	
	
}
