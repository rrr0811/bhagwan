package configAnnotationsExecution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import configAnnotations.BaseScript;

public class Harley extends BaseScript{
	@Test
	public void harley() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.harley-davidson.com/in/en/index.html");
		driver.quit();
	}
}
