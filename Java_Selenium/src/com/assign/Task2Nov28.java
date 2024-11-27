package com.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Nov28 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
//		WebElement element = driver.findElement(By.partialLinkText( "SPANISH"));
//		System.out.println(element.getText());
		driver.findElement(By.partialLinkText("SPANISH")).click();
		driver.findElement(By.partialLinkText("ENGLISH")).click();
		driver.findElement(By.partialLinkText("SIGN IN")).click();
		driver.findElement(By.id("email")).sendKeys("harshagr@gmail.com");
		driver.findElement (By.name("password")).sendKeys( "harsha@2001");
		driver.findElement(By.id( "usertype_yes")).click();
		driver.findElement(By.id("groupcode")).sendKeys("TYSS123");
		driver.findElement(By.name( "remember")).click();
		
	}
}
