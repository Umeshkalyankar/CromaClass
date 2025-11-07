package testNG;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class TestngDemo4 {
		
	@BeforeClass
	public void classRun()
	{
		System.out.println("---Login test with Headless1 running now---");
	}
	@AfterClass
	public void classStop()
	{
		System.out.println("---Login test with Headless1 stop now---");
		
		
	}
	@Test
	public void testcase1() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("Umesh9pm@gmail.com");
		
	}
	@Test
	public void testcase2() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("Umesh9pm@gmail.com");
		
	}
	@Test
	public void testcase3() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("Umesh9pm@gmail.com");
		
	}
	@Test
	public void testcase4() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("Umesh9pm@gmail.com");
		
	}
	@Test
	public void testcase5() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("Umesh9pm@gmail.com");
		
	}
	
}
