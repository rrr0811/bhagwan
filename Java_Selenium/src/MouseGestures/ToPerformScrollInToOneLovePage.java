package MouseGestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformScrollInToOneLovePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://onepagelove.com/");
		Actions action=new Actions(driver);
		for(;;)
		{
			try
			{
				driver.findElement(By.xpath("//img[contains(@alt,'Howells Studio')]")).click();
				break;
			}
			catch(NoSuchElementException e)
			{
				action.scrollByAmount(0, 500).perform();
			}
		}	
	}
}
