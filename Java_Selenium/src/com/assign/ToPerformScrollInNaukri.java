package com.assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToPerformScrollInNaukri {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.naukri.com/");
		Actions actions=new Actions(driver);
		WebElement resumeWriting = driver.findElement(By.xpath("//span[text()='Resume writing']"));
		actions.scrollFromOrigin(ScrollOrigin.fromElement(resumeWriting), 0, 200).perform();
		resumeWriting.click();
	}
	
}
