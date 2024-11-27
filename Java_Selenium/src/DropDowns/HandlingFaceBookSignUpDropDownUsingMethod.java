package DropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingFaceBookSignUpDropDownUsingMethod {
	public static void lastSelect(WebElement dropdown) {
		Select lastSelectOption=new Select(dropdown);
		int options=lastSelectOption.getOptions().size();
		lastSelectOption.selectByIndex(options-1);
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/signup");
		WebElement dayListBox = driver.findElement(By.id("day"));
		lastSelect(dayListBox);
		WebElement monthListBox = driver.findElement(By.id("month"));
		lastSelect(monthListBox);
		WebElement yearListBox = driver.findElement(By.id("year"));
		lastSelect(yearListBox);
	}
}
