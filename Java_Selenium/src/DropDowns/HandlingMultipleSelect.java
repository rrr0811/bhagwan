package DropDowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement coursesListBox=driver.findElement(By.id("cars"));
		Select coursesSelect=new Select(coursesListBox);
		coursesSelect.selectByIndex(1);
		coursesSelect.selectByValue("299");
		coursesSelect.selectByVisibleText("Free ( 90 )");
		System.out.println(coursesSelect.getFirstSelectedOption().getText());
		coursesSelect.deselectByIndex(0);
		coursesSelect.deselectByValue("99");
		coursesSelect.deselectByVisibleText("INR 200 - INR 299 ( 3 )");

	}
}
