package com.assign;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Nov28 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maybelline.com/");
		String parentWindowId = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nykaafashion.com/");
		driver.findElement(By.linkText("Men")).click();
		Thread.sleep(2000);
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowId: allWindowIds) {
			Thread.sleep(1000);
			if(driver.switchTo().window(windowId).getTitle().contains("Men")) {
				driver.findElement(By.linkText("Careers")).click();
				break;
			}
		}
		driver.switchTo().window(parentWindowId).close();
		
	}
}
