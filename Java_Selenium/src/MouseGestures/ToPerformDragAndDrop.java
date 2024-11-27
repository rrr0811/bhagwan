package MouseGestures;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToPerformDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(60));
		driver.get("https://trello.com/login");
		
		driver.findElement(By.id("user")).sendKeys("harshavardhangr008112001@gmail.com");
		driver.findElement(By.id("login")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("password")).sendKeys("Harshu@143",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[contains(@title,'Board')]")).click();
		WebElement source = driver.findElement(By.xpath("//a[text()='In progress']"));
		WebElement target = driver.findElement(By.xpath("//h2[text()='Selenium']/../../..//button[text()='Add a card']"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source,target).perform();
		
		
	}

}
