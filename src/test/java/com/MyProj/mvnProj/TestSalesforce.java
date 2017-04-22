package com.MyProj.mvnProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestSalesforce {
	@Test
	public void Test()
	{
		String Path=System.getProperty("user.dir");
	//System.setProperty("webdriver.chrome.driver",Path+"\\chromedriver_win32\\chromedriver.exe");
     System.setProperty("webdriver.chrome.driver",Path+"\\chromedriver_linux64\\chromedriver");	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://test.salesforce.com");
	
	driver.findElement(By.id("username")).sendKeys("suruchi.agrawal@accenture.com.smip.qa");
	driver.findElement(By.id("password")).sendKeys("Testing123456");
	
	driver.findElement(By.id("Login")).click();
	
	
	
	
}
}