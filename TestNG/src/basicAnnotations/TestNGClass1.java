package basicAnnotations;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGClass1 
{
	@Test
	public void test1()
	{
		System.out.println("Testing first testing method");
	}
	
	@Test(priority=0)
	public void test2()
	{
		System.out.println("Testing second testing method");
		throw new SkipException("Testing");
	}
	
	@Test(dependsOnMethods= {"test1","test2"})
	public void test3()
	{
		System.out.println("Testing third testing method");
		Assert.fail("Testing Failure");
	}
	
	@Test(priority=1)
	public void test4()
	{
		System.out.println("Testing fourth testing method");
		Assert.assertEquals("Anand", "bhayre");
	}
	
	
}
