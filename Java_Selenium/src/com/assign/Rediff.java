package com.assign;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rediff {
	public static void main(String[] args) throws  IOException, InterruptedException {
		String email = "sumanthELFBatch@rediffmail.com";
		String password = "Testing@123";
		String subject="Harshavardhan";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath( "//input[@id='login1']")).sendKeys(email);
		driver.findElement(By .xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath( "//input[@title='Sign in']")).click();
		driver. findElement(By.xpath( "//li[@title='Compose a new mail']//a")).click();
		driver.findElement(By.xpath("//input[@id='TO_IDcmp2']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='']")).sendKeys(subject);
		WebElement bodyOfMail = driver.findElement(By.xpath( "//iframe[contains(@title,\"Rich Text Editor\")]"));
		driver.switchTo().frame(bodyOfMail);
		driver.findElement(By.tagName("body")).sendKeys("Good Evening");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[ contains(@class,'send')]")).click();
		Thread.sleep(10000);
		File sent=new File("./ErrorShots/sent.png");
		WebElement sentConfirmBar = driver.findElement(By.xpath("//div[@id='rdNotify']"));
		explicitWait.until(ExpectedConditions.textToBePresentInElement(sentConfirmBar,"Your mail has been sent"));
		FileHandler.copy(sentConfirmBar.getScreenshotAs(OutputType.FILE),sent);
		driver.findElement(By.xpath( "//a[@class='rd_active']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath( "//span[@title='"+subject+"']/..//cite[@title='Select mail']")).click();
		driver.findElement(By.xpath("//span[@class='rd_fil_del']")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		File delete=new File("./ErrorShots/delete.png");
		WebElement deleteConfirmBar = driver.findElement(By.xpath("//div[@id='rdNotify']"));
		explicitWait.until(ExpectedConditions.textToBePresentInElement(deleteConfirmBar, "1 mail deleted successfully"));
		FileHandler.copy(deleteConfirmBar.getScreenshotAs(OutputType.FILE),delete);
		driver.quit();
	}
}
