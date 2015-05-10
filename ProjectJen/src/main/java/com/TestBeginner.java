package com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBeginner {
	
	public ConfigTest cf1 = new ConfigTest("firefox");
	public WebDriver driver = cf1.initializeBrowser();
	
	@BeforeTest
	
	public void testBeginner()
	{
		System.out.println("Test is begun");
		//driver.get(cf1.getData("url"));
		
	}
	
	@AfterTest
	
	public void afterTest()
	{
		driver.quit();

		System.out.println("Test is done");
		
	}

}
