package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureErrorMsgInVtiger {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement emailTextBox = driver.findElement(By.id("username"));
		emailTextBox.clear();
		emailTextBox.sendKeys("harsha");
		WebElement passwordTextBox= driver.findElement(By.id("password"));
		passwordTextBox.clear();
		passwordTextBox.sendKeys("Harsh@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(1000);
		String errorMsg=driver.findElement(By.id("validationMessage")).getText();
		System.out.println(errorMsg);
	}
}
