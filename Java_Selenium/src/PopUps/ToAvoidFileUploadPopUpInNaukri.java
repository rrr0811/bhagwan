package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToAvoidFileUploadPopUpInNaukri {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		WebElement uploadButton = driver.findElement(By.id("resumeUpload"));
		Actions actions=new Actions(driver);
		actions.scrollFromOrigin(ScrollOrigin.fromElement(uploadButton), 0, 200).perform();
		uploadButton.sendKeys("C:\\Users\\Harsha GR\\Downloads\\Harshavardhan_G_R_resume.pdf");
	}
}
