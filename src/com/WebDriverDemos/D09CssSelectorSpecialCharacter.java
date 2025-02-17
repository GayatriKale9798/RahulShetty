package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09CssSelectorSpecialCharacter {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//* - Contains
		//WebElement emailId = driver.findElement(By.cssSelector("input[placeholder*=\"address\"]"));
		//emailId.sendKeys("ankushvankore@gmail.com");
		
		WebElement emailId = driver.findElement(By.cssSelector("input#email"));
		emailId.sendKeys("ankushvankore@gmail.com");
		
		//$ - Ends With
		WebElement password = driver.findElement(By.cssSelector("input[data-testid$=\"pass\"]"));
		password.sendKeys("123456789");
		
		//^ - Starts With
		WebElement loginBtn = driver.findElement(By.cssSelector("button[id^=\"u_0_5_\"]"));
		loginBtn.click();
	}

}