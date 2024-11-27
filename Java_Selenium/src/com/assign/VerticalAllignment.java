package com.assign;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerticalAllignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Java_Selenium/Resources/MultipleWindow.html");
		Dimension size = driver.manage().window().getSize();
		Point point=driver.manage().window().getPosition();
		int width=306;
		int height=744;
		int position=point.getX();
		int xincrease=width;
		int count=0;
		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowId:allWindowIds) {
			driver.switchTo().window(windowId);
			driver.manage().window().setSize(new Dimension(width,height));
			driver.manage().window().setPosition(new Point(position, 0));
			count++;
			if(count==1)
				position+=500;
			else 
				position+=xincrease-16;
		}
		
	}
}
