package com.amazon.qa.baseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.amazon.qa.factory.DriverFactory;
import com.amazon.qa.util.ScreenShots;

public class BaseClass 
{
	public String baseURL = "https://www.amazon.in/";
	public String userName = "8297487606";
	public String password = "Chsumuma@1";
	public static WebDriver driver;
	

	@BeforeClass
	public void driver()
	{
		DriverFactory df = new DriverFactory();
		df.getChromedriver();
	}

	@AfterClass
	public void Ss()
	{
		ScreenShots s = new ScreenShots();
		s.tearDown();
	}
	}

