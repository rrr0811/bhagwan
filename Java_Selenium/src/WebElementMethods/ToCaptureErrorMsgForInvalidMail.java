package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureErrorMsgForInvalidMail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("harsha");
		driver.findElement(By.id("Password")).sendKeys("harsha2001");
		Thread.sleep(1000);
		String errormsg=driver. findElement(By.cssSelector("span[for='Email']")).getText();
		System.out.println(errormsg);
	}
}
