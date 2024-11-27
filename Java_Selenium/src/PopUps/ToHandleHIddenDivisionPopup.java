package PopUps;

import java.time.Duration;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHIddenDivisionPopup {
	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		String month = ldt.getMonth().name();
		month=month.substring(0,1).toUpperCase()+month.substring(1).toLowerCase();
		int year = ldt.getYear();
		int date = ldt.getDayOfMonth();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://www.agoda.com/");
		driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/..//span[text()='"+date+"']")).click();
		driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/..//span[text()='"+(date+1)+"']")).click();
		
	}
}
