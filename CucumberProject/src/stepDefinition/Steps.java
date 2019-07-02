package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps 
{
	ChromeDriver dr;
	@Given("^Application is up and running$")
	public void application_is_up_and_running() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Java\\Drivers\\chromedriver.exe");
		
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/");
		
	}

	@When("^I enter valid credentials$")
	public void i_enter_valid_credentials() 
	{
		 System.out.println("Enter Credentials");
	}

	@Then("^I should be looged in successfully\\.$")
	public void i_should_be_looged_in_successfully()
	{
		 System.out.println("I should be logged in successfully");
	}

	@When("^I enter (.*?) and (.*?) on Login page$")
	public void enter_credentials(String username, String password)
	{
		dr.findElement(By.name("userName")).sendKeys(username);
		dr.findElement(By.name("password")).sendKeys(password);
		dr.findElement(By.name("login")).click();
	}
	@Then("^Error message should be displayed$")
	public void error_message()
	{
		dr.close();
	}
}


