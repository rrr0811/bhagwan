package configAnnotationsExecution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import configAnnotations.BaseScript;

public class BMW extends BaseScript {
	@Test
	public void bmw() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmw-motorrad.in/en/home.html#/filter-all");
		driver.quit();
	}
}
