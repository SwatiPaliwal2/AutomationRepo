package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumClass2 
{

	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Java\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/");
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		
		WebElement ele= dr.findElement(By.name("passCount"));
		
		Select sel = new Select(ele);
		Thread.sleep(3000);
		sel.selectByValue("2");
		Thread.sleep(3000);
	
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		
		sel= new Select(dr.findElement(By.name("fromPort")));
		
		sel.selectByIndex(3);
		
		dr.findElement(By.xpath("//input[@value='Business']")).click();
		
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		String str = dr.findElement(By.xpath("//font[@face='Arial, Helvetica, sans-serif'][@size='2']")).getText();
		
		System.out.println(str);
		
		dr.findElement(By.cssSelector("input[name='reserveFlights']")).click();
		
		dr.findElement(By.cssSelector("input[name='ticketLess']")).click();
		
		System.out.println(dr.findElement(By.cssSelector("input[name='ticketLess']")).isSelected()); // to check if the check box is selected

}
}
