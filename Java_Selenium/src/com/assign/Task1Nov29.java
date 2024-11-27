package com.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Nov29 {
	public static void main(String[] args) throws InterruptedException {
		String email="harshagr8@gmail.com";
		String password="Harsh@2001";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Harsha");
		driver.findElement(By.id("LastName")).sendKeys("G R");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector( "input[value='Continue']")).click();
		driver.findElement(By.partialLinkText("Log out")).click();
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.findElement(By.partialLinkText( "Electronics")).click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
		driver.findElement(By.cssSelector(" input[value='Add to cart']" )).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		driver.findElement(By.name( "removefromcart")).click();
		driver.findElement(By.name( "updatecart")).click();
		
	}
}
