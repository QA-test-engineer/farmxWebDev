package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class farmXtest {
	
	WebDriver driver;
	
	@BeforeTest
	public void InitiaseBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();		
	}
	
	@AfterTest
	public void TearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test(priority=0)
	public void LaunchApp()
	{
		driver.get("https://web-dev.farmx.co/map?blockId=738748");
	}
	
	@Test(priority=2)
	public void enterLoginDetails() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("uday.patre@farmx.ag");
		driver.findElement(By.id("password")).sendKeys("QAuday@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-test-id='login-submit']")).click();
	}
	
	@Test
	public void verifyLogin()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement recommendation=driver.findElement(By.xpath("//h1[@class='ant-typography']"));
		System.out.println(recommendation.isDisplayed());
		System.out.println(recommendation.getText());
	}

}
