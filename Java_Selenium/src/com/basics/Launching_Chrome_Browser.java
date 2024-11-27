package com.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Chrome_Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	}
}
