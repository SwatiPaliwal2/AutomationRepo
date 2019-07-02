package libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Config;

public class ApplicationLibrary 
{
	
	/*Author : Anand Bhayre
	 * Date : 28/06/2019
	 * Description: This Function will launch the browser
	 * Param : No Parameter
	 * Return : It will return instance of the driver
	 */
	public WebDriver launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver",Config.chromeDriverpath);
		
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		return dr;
	}
	
	/*Author : Anand Bhayre
	 * Date : 28/06/2019
	 * Description: This Function will navigte to url
	 * Param : webDriver and url
	 * Return : It will return title of the application
	 */
	public String navigate(WebDriver dr, String url)
	{
		dr.get(url);
		return dr.getTitle();
	}

	public boolean isElementPresent(WebDriver dr, By ele)
	{
		int size = dr.findElements(ele).size();
		if (size>=1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
