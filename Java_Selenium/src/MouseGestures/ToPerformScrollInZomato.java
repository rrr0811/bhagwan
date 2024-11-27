package MouseGestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToPerformScrollInZomato {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.zomato.com/bangalore");
		Actions actions=new Actions(driver);
		ScrollOrigin ref = ScrollOrigin.fromElement(driver.findElement(By.xpath("//h5[text()='Marathahalli']")));
		actions.scrollFromOrigin(ref, 0, 200).perform();
	}
	
}
