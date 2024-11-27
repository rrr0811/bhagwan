package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementByNameVaru {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/user/login");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("harsha@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("harsha2001");
		Thread.sleep(1000);
		driver.findElement(By.name("captcha")).sendKeys("i am good boy");
		Thread.sleep(1000);
		driver.findElement(By.name("remember")).click();
	}
}
