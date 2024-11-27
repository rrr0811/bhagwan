package com.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAndCompareAligmentsInFacebook {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("passContainer"));
		Dimension emailBoxSize = email.getSize();
		Dimension passwordBoxSize = password.getSize();
		Point emailBoxLoc = email.getLocation();
		Point passwordBoxLoc = password.getLocation();
		if(emailBoxLoc.getX()==passwordBoxLoc.getX())
			System.out.println("left alignment is proper");
		else
			System.out.println("left alignment is not proper");
		
		if(emailBoxLoc.getX()+emailBoxSize.getWidth()==passwordBoxLoc.getX()+passwordBoxSize.getWidth()) 
			System.out.println("right alignment is proper");
		else
			System.out.println("right alignment is not proper");
				
	}
}
