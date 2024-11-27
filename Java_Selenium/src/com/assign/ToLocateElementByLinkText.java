package com.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementByLinkText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.linkText("Dining & Kitchen")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Modular Kitchen")).click();
		//driver.findElement(By.linkText("  Modular Kitchen")).click();
	}
}
