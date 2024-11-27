package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandImplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.xpath("//span[text()='Skinny Men Blue Jeans']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("560098");
		WebElement checkBtn = driver.findElement(By.id("Check"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(checkBtn));
		checkBtn.click();
	}
}
