package com.basics;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingUsingNavigationMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		Thread.sleep(2000);
		driver.get("https://www.honda2wheelersindia.com/");
		Thread.sleep(2000);
		driver.get("https://www.heromotocorp.com/en-in.html");
		Thread.sleep(2000);
		Navigation navigation = driver.navigate();
		navigation.back();
		Thread.sleep(2000);
		navigation.back();
		Thread.sleep(2000);
		navigation.forward();
		Thread.sleep(2000);
		navigation.refresh();
		driver.manage().window().getPosition();
		
	}
}
