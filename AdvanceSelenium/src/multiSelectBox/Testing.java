package multiSelectBox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testing 

{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Java\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("file:///C:/Users/dell/Downloads/Practice.html");
		
		Select sel = new Select(dr.findElement(By.id("anand")));
		
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		sel.selectByIndex(4);
		sel.deselectByIndex(0);
		
	}
}
