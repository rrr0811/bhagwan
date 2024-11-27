package com.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkOnIsEnabledAndIsDisplayedInSkillrary {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/user/login");
		WebElement radioBtnYes = driver.findElement(By.id("usertype_yes"));
		WebElement radioBtnNo = driver.findElement(By.id("usertype_no"));
		WebElement groupCodeBox=driver.findElement(By.id("usergroup_type"));
		if(radioBtnNo.isEnabled()) {
			System.out.println("groupCodeBox status before clicking yes : "+groupCodeBox.isDisplayed());
			radioBtnYes.click();
			System.out.println("groupCodeBox status after clicking yes : "+groupCodeBox.isDisplayed());
			
		}
	}
}
