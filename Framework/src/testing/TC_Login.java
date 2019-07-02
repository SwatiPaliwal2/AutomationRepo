package testing;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configuration.Config;
import libraries.ApplicationLibrary;
import pages.FlightFinder;
import pages.HomePage;

public class TC_Login 
{
	WebDriver dr;
	@BeforeMethod
	public void initialize()
	{
		
	}
	
	
		@Test
		public void script()
		{
			ApplicationLibrary lib = new ApplicationLibrary();
			
			//Launch Browser
			WebDriver dr = lib.launchBrowser();
			assertTrue(dr!=null);
			
			// Navigate to application
			
			String res = lib.navigate(dr, Config.applicationURL);
			assertTrue(res.contains("Mercury Tours"));
			
			//Login
			HomePage page = new HomePage(dr);
			
			page.login("mercury", "mercury");
			
			FlightFinder page2 = new FlightFinder(dr);
			assertTrue(lib.isElementPresent(dr, page2.oneway));
		}


}
