package MouseGestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMouseHover {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.xpath("//button[text()='No, don’t.']")).click();
		Actions actions=new Actions(driver);
		WebElement homeAppliances=driver.findElement(By.xpath("//div[text()='Home Appliances']"));
		actions.moveToElement(homeAppliances);
		actions.contextClick().perform();
		driver.findElement(By.linkText("Robotic Vacuum Cleaners")).click();
	}
}
