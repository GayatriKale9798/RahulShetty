package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class D05Before_After_Method {
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Before Test");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		System.out.println("After Test");
	}

	@Test(priority = 1)
	public void testAmazon() {
		driver.get("https://www.amazon.in/");
	}

	@Test(priority = 4)
	public void testMyntra() {
		driver.get("https://www.myntra.com/");
	}

	@Test(priority = 3)
	public void testAjio() {
		driver.get("https://www.ajio.com/");
	}

	@Test(priority = 2)
	public void testMeesho() {
		driver.get("https://www.meesho.com/");
		
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\tBefore Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\t\tTitle: " + driver.getTitle());
		System.out.println("\tAfter Method");
		
	}

}