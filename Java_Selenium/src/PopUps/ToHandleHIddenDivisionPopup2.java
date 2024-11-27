package PopUps;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleHIddenDivisionPopup2 {
	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		String month = ldt.getMonth().name();
		month=month.substring(0,1).toUpperCase()+month.substring(1).toLowerCase();
		int year = ldt.getYear();
		int date = ldt.getDayOfMonth();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		WebDriverWait explicit=new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.agoda.com/");
		explicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Close Message']")));
		driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+(year+1)+"']/..//span[text()='"+(date-2)+"']")).click();
				driver.findElement(By.xpath("//div[text()='"+month+" "+(year+1)+"']/..//span[text()='"+(date-1)+"']")).click();
				break;
			}
			catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
		}
		
	}
}
