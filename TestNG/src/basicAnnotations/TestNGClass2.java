package basicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass2 
{
	@Test
	public void test1()
	{
		System.out.println("Test 1");
	}
	@Test
	public void est2()  // Alphanumeric order, hence est2 will be executed first
	{
		System.out.println("Test 2");
	}
	
	@BeforeMethod
	public void precondition()
	{
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void postcondition()
	{
		System.out.println("AfterMethod");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
}
