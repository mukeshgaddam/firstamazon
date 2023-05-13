package com.amazon.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory {

	private static DriverFactory Setup;
	private final WebDriver Driver;
	
	public DriverFactory()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		Driver = new ChromeDriver();
	}
	
	public static DriverFactory getInstance() {
		if(Setup == null ) {
			Setup = new DriverFactory();
		}
		return Setup;
	}
	public WebDriver getChromedriver() {
		return Driver;
	}
}