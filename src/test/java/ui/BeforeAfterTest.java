package ui;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTest {
	
	@BeforeTest
	public void loginToApplication() 
	{
		System.out.println("Login To Application");		
	}

	@AfterTest
	public void logoutToApplication() 
	{
		System.out.println("Logout To Application");		
	}
	
	@Test
	public void loginTest() 
	{		
		System.out.println("Login is successful");
	}
	
	@Test(priority=2,description="This is a log out test")
	public void logoutTest() 
	{
		System.out.println("Logout is successful");
	}	
	
}
