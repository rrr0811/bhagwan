package com.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingUsingGetMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
	}
}
