package AnnotationsTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnnotationsTest 
{
	public WebDriver driver = null;

	String driverPath = "C:\\Program Files\\swt\\Drivers\\Chromedriver.exe";

	@Test
	public void LaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("Browser Launched Successfully");
	}
}
