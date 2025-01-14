package com.TestNGDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class D03Before_After_Test {
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Before Test");
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		System.out.println("After Test");
	}
	
	@Test (priority = 1)
	public void testAmazon()
	{
		driver.get("https://www.amazon.in/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 4)
	public void testMyntra()
	{
		driver.get("https://www.myntra.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 3)
	public void testAjio()
	{
		driver.get("https://www.ajio.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 2)
	public void testMeesho()
	{
		driver.get("https://www.meesho.com/");
		System.out.println("Title: " + driver.getTitle());
	}

}