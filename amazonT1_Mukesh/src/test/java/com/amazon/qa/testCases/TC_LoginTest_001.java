package com.amazon.qa.testCases;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.testng.annotations.Test;


import com.amazon.qa.baseClass.BaseClass;
import com.amazon.qa.pages.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	static Logger log;
	@Test
	public void loginTest()
	{
		log = Logger.getLogger(TC_LoginTest_001.class);
		PropertyConfigurator.configure("log4j.properties");
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		lp.inURL();
		lp.setUserName(userName);
		lp.clickContinue();
		lp.setPassword(password);
		lp.clickSignInbtn();
		System.out.println("username:passed");
		log.info("Passed");
		System.out.println("Password:passed");
		
		
	}
}
