package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformCopyPasteActionUsingSendKeys {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("harsha",Keys.CONTROL+"a");
		firstName.sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("LastName")).sendKeys(Keys.CONTROL+"v");
	}
}
