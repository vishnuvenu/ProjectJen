package com.pega.com.pega1;

import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class myMavenSelenium1 {
	
//	PropertyConfigurator.
	Logger logger = Logger.getLogger(myMavenSelenium1.class);

	
	@Test
	public void startTest()
	{
		
		System.out.println("ytetsuau");
		HomePage homepage = new HomePage();
		homepage.login("admin","password");
		System.out.println("teted");
		//logger.debug("test");
		//logger.error("error");
			}

}
