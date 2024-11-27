package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureErrorMsgInVtigerClearCredentials {
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
		WebElement submitBtn=driver.findElement(By.xpath("//button[text()='Sign in']"));
		submitBtn.submit();
		Thread.sleep(1000);
		WebElement validateMsg=driver.findElement(By.id("validationMessage"));
		validateMsg.getText();
		System.out.println(validateMsg.getText());
		Thread.sleep(5000);		
		driver.findElement(By.id("username")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("validationMessage")).getText());
	}
}
