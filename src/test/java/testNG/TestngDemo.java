package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngDemo {
	WebDriver driver;
	WebElement userId;
	WebElement password;
	
	@BeforeMethod
	public void browserOpen()
	{
		String url = "https://www.facebook.com";
	    driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		userId = driver.findElement(By.id("email"));
		password = driver.findElement(By.id("pass"));
	}
	
	@Test(priority=3)
	public void testcase1() throws InterruptedException
	{
		
		userId.sendKeys("Umesh8@gmail.com");
		Thread.sleep(2000);
		password.sendKeys("Test@123");
	}
	
	@Test(priority=2)
	public void testcase2() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("Harsh9@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Test@123");
	}
	
	
	@Test(priority=1)
	public void testcase4() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("Harsh91@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Test@123");
	}
	
	@AfterMethod
	public void browserClose()
	{
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}   

}
