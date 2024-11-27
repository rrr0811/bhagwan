package MouseGestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToPerformContextClickInMyTrelloBoard {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait explicit=new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("harshavardhangr008112001@gmail.com");
		driver.findElement(By.id("login")).click();
		//WebElement password = driver.findElement(By.id("password"));
		explicit.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("password")).sendKeys("Harshu@143");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//div[contains(@title,'Board')]")).click();
		WebElement completedBar = driver.findElement(By.xpath("//a[text()='Completed']"));
		Actions actions=new Actions(driver);
		actions.contextClick(completedBar).perform();
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='quick-card-editor-buttons']")).getText());
	}
}
