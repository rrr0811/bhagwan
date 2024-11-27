package configAnnotationsExecution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import configAnnotations.BaseScript;

public class Hayabusa extends BaseScript{
	@Test
	public void hayabusa() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
		driver.quit();
	}
}
