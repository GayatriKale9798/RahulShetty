package com.WebDriverDemos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D30HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.xpath("//a[@class='newclose']")).click();
		driver.findElement(By.xpath("//a[@class='newclose2']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[2]/div/div/div[2]/div/div/a[2]/span[2]")).click();
		
		System.out.println("Title: " + driver.getTitle());
		Set<String>windows = driver.getWindowHandles();
		System.out.println(windows);
		Iterator<String>itr=windows.iterator();
		String win1=itr.next();
		String win2=itr.next();
		//System.out.println(win1 + win2);
		//Switching to 2nd window
				driver.switchTo().window(win2);
				System.out.println("Title: " + driver.getTitle());
				
				driver.findElement(By.linkText("Continue")).click();
				
				Thread.sleep(2000);
				driver.switchTo().window(win1);
				
				driver.findElement(By.linkText("CONTACT US")).click();
				Thread.sleep(2000);
				
				driver.quit();

	}

}
