package com.assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Purplle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.purplle.com/");
		driver.findElement(By.xpath("//span[text( )='What are you looking for?']")).click();
		//searchBox.sendKeys("Trimmer For men");
		WebElement searchBox = driver.findElement(By.xpath( "(//input[@focus='textFocus'])[2]"));
		searchBox.sendKeys( "Trimmer for Men",Keys.ENTER);
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//img[contains(@title,'Kemei KM-PG100')]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Add To Cart")).click();
		//Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("(//i[contains(@class,'search3')])[2]")).click();
		driver.findElement(By.xpath( "(//input[@focus='textFocus'])[2]")).sendKeys("perfume",Keys.ENTER);
		driver.findElement(By.xpath("//img[contains(@title,'Engage W2')]")).click();
		driver.findElement(By.partialLinkText("Add To Cart")).click();
		driver.navigate().back();
//		driver.findElement(By.xpath("(//i[contains(@class,'search3')])[2]")).click();
//		driver.findElement(By.xpath( "(//input[@focus='textFocus'])[2]")).sendKeys("face wash",Keys.ENTER);
//		driver.findElement(By.xpath("//img[contains(@title,'Simple')]")).click();
//		driver.findElement(By.partialLinkText("Add To Cart")).click();
//		driver.navigate().back();
		driver.findElement(By.xpath("//i[ contains(@class,'p-basket')]")).click();
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='ng-star-inserted']//span"));
		ArrayList al=new ArrayList();
		for(WebElement price: prices) {
			al.add(Integer.parseInt(price.getText()));
		}
		Collections.sort(al);
		System.out.println(al);
		driver.findElement(By.xpath("//span[contains(text(),'"+al.get(0)+"')]/../../../../.. //div//a[contains(.,'Remove')]")).click();
		driver.findElement(By.xpath("//a[.='Yes']")).click();
		}
}
