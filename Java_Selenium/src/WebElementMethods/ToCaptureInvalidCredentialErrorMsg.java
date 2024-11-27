package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureInvalidCredentialErrorMsg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("harsha@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("harsha2001");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(1000);
		String errorMsg = driver.findElement(By.cssSelector( "div[class='validation-summary-errors']")).getText();
		System.out.println(errorMsg);
	}
}
