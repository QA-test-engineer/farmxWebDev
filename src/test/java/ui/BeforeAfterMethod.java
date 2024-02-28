package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
	
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
	
	@BeforeMethod
	public void DBconnection() 
	{
		System.out.println("DB Connected");
	}
	
	@AfterMethod
	public void DBdisconnection()
	{
		System.out.println("DB Disconnected");
	}
	
	@Test(priority=1,description="This is a login test")
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
