package PopUps;

import java.awt.AWTException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ToOpenInIncognitoUsingChromeOptions {
	public static void main(String[] args) throws AWTException, InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions settings= new ChromeOptions();
		settings.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.youtube.com/");  
		
		
		//Declare and initialise a fluent wait
		FluentWait wait = new FluentWait(driver);
		//Specify the timeout of the wait
		wait.withTimeout(Duration.ofSeconds(15));
		//Sepcify polling time
		wait.pollingEvery(Duration.ofMillis(250));
		//Specify what exceptions to ignore
		wait.ignoring(NoSuchElementException.class)
		//This is how we specify the condition to wait on.
		wait.until(ExpectedConditions.alertIsPresent());
	}
}
