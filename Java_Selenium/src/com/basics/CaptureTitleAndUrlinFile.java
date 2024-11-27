package com.basics;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitleAndUrlinFile {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		File f=new File("./Resources/Title_and_Url.txt");
		System.out.println(f.createNewFile());
		FileOutputStream fos=new FileOutputStream(f);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		String titleOfWebPage=driver.getTitle();
		String urlOfWebPage=driver.getCurrentUrl();
		fos.write(titleOfWebPage.getBytes());
		fos.write(urlOfWebPage.getBytes());
		
		
	}
}
