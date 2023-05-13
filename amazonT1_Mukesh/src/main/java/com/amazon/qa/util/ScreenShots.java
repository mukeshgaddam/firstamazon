package com.amazon.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

import com.amazon.qa.factory.DriverFactory;

public class ScreenShots
{
	public static WebDriver driver;
	//DriverFactory d = new DriverFactory();
//d.
	
	public void tearDown()
	{	
		String path;
	
	try {
        WebDriver augmentedDriver = new Augmenter().augment(driver);
        File source = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
         path = "./target/screenshots/" + source.getName();
        FileUtils.copyFile(source, new File(path)); 
    }
    catch(IOException e) {
         path = "Failed to capture screenshot: " + e.getMessage();
    }

}
}
