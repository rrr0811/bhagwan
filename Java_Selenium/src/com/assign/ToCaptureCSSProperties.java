package com.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureCSSProperties {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.findElement(By.partialLinkText("SPANISH")).click();
		driver.findElement(By.partialLinkText("ENGLISH")).click();
		driver.findElement(By.partialLinkText("SIGN UP")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up ']")).click();
		System.out.println("firstname error msg color: "
				+driver.findElement(By.id("first_name-error")).getCssValue("color"));
		System.out.println("lastname error msg color: "
				+driver.findElement(By.id("last_name-error")).getCssValue("color"));
		System.out.println("email error msg color: "
				+driver.findElement(By.id("email-error")).getCssValue("color"));
		System.out.println("phone error msg color: "
				+driver.findElement(By.id("phone-error")).getCssValue("color"));
		System.out.println("password error msg color: "
				+driver.findElement(By.id("password-error")).getCssValue("color"));
		System.out.println("confirm password error msg color: "
				+driver.findElement(By.id("password_confirmation-error")).getCssValue("color"));
		
	}
}
