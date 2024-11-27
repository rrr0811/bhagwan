package GroupExecution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Puneeth {
	@Test(groups = "KFI")
	public void puneeth() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Puneeth_Rajkumar");
		driver.quit();
	}
}
