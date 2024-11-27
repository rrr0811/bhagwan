package WebElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartInPurplle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.purplle.com/");
		driver.findElement(By.xpath("//span[text( )='What are you looking for?']")).click();
		WebElement searchBox = driver.findElement(By.xpath( "(//input[@focus='textFocus'])[2]"));
		searchBox.sendKeys( "Trimmer for Men",Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(text(),'HTC AT-522')]/../../../..//a[text()=' Add to Cart ']")).click();
	}
}
