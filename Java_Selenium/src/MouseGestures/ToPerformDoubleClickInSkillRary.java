package MouseGestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDoubleClickInSkillRary {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapp.skillrary.com/product.php?product=testing");
		Actions actions=new Actions(driver);
		actions.doubleClick(driver.findElement(By.id("add"))).doubleClick().perform();
		Thread.sleep(2000);
		actions.doubleClick(driver.findElement(By.id("minus"))).doubleClick().perform();
	}
}
