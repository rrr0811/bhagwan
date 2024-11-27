package MouseGestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformActions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).click(driver.findElement(By.xpath("//a[text()='Bluetooth Headphones']"))).perform();	
	}
	
}
