package ui;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestngClass {
  @Test(testName="test1")
  public void testMethod1() {
	  System.out.println("Test Method 1");
  }
  
  @Test(testName="test2")
  public void testMethod2() {
	  System.out.println("Test Method 2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after Suite");
  }

}
