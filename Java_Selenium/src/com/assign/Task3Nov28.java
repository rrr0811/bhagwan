package com.assign;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Nov28 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
		Thread.sleep(2000);
		Set<String> allWindowsId = driver.getWindowHandles();
		for(String windowId: allWindowsId) {
			if(driver.switchTo().window(windowId).getCurrentUrl().contains("troubleloginhome")){
				driver.findElement(By.id("nextStep")).click();
				break;
			}
		}
		driver.findElement(By.id("userName")).sendKeys("Harsha");
		driver.findElement(By.id("accountNo")).sendKeys("120014001500");
		driver.findElement(By.id("mobileNo")).sendKeys("6360561209");
		driver.findElement(By.id("datepicker5")).sendKeys("08/11/2001");
		driver.findElement(By.name("captchaValue")).sendKeys("567812");
		driver.findElement(By.id("go")).click();
	}
}
