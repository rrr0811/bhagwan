package com.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementByIdInShopperStack {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(20000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Create Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("First Name")).sendKeys("Harsha");
		Thread.sleep(1000);
		driver.findElement(By.id("Last Name")).sendKeys("G R");
		Thread.sleep(1000);
		driver.findElement(By.id("Male")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Phone Number")).sendKeys("6360561209");
		Thread.sleep(1000);
		driver.findElement(By.id("Email Address")).sendKeys("harshagr@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Harsha@2001");
		Thread.sleep(1000);
		driver.findElement(By.id("Confirm Password")).sendKeys("Harsha@2001");
		Thread.sleep(1000);
		driver.findElement(By.id("Terms and Conditions")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnDisabled")).click();
		
	}
}
