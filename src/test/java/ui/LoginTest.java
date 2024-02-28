package ui;

import org.testng.annotations.Test;

public class LoginTest {

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
