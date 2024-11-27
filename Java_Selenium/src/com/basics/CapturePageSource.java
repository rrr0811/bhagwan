package com.basics;

import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturePageSource {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		FileOutputStream fos=new FileOutputStream("./Resources/PageSource.html ");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		String pageSource=driver.getPageSource();
		fos.write(pageSource.getBytes());
	}
}
