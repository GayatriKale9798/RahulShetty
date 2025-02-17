package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D36NavigationMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/");
		//driver.navigate().to("https://jqueryui.com/");
		
		driver.findElement(By.partialLinkText("Drop")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.findElement(By.partialLinkText("Drop")).getText();
		driver.findElement(By.partialLinkText("Drop")).getAttribute("innerText");
	}

}
