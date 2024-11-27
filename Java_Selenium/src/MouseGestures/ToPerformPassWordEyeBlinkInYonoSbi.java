package MouseGestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformPassWordEyeBlinkInYonoSbi {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		//driver.findElement(By.xpath("//span[text()='✕']")).click();
		Actions actions=new Actions(driver);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Testing123");
		actions.moveToElement(password,295,0).click().perform();	
	}
}
