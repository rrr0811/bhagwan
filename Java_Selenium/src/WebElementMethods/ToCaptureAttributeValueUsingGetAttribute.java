package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAttributeValueUsingGetAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.findElement(By.partialLinkText("SPANISH")).click();
		driver.findElement(By.partialLinkText("ENGLISH")).click();
		driver.findElement(By.partialLinkText("SIGN IN")).click();
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.clear();
		emailTextBox.sendKeys("harshagr@gmail.com");
		String valueEntered = emailTextBox.getAttribute("value");
		System.out.println(valueEntered);
	}
}
