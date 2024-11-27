package KeyBoardActions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformKeyUpAndKeyDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://parivahan.gov.in/parivahan/");
		Actions actions =new Actions(driver);
		List<WebElement> allNavElements = driver.findElements(By.xpath("//li[@data-level='1']"));
		for(WebElement navElement:allNavElements) {
			actions.keyDown(Keys.CONTROL).perform();
			navElement.click();
			actions.keyUp(Keys.CONTROL).perform();
		}
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowId: allWindowIds) {
			driver.switchTo().window(windowId);
			if(driver.getTitle().contains("Site")) {
				driver.close();
				break;
			}
		}
	}
}
