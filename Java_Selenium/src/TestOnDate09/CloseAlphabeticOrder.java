package TestOnDate09;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAlphabeticOrder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./DRivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("C:\\Users\\Harsha GR\\Downloads\\TestPage.html");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		Set<String> allWindowIds = driver.getWindowHandles();
		List<String> names=new ArrayList<String>();
		for(String WindowId: allWindowIds) {
			names.add(driver.switchTo().window(WindowId).getTitle());
		}
		Collections.sort(names);
		for(String windowId:allWindowIds) {
			driver.switchTo().window(windowId);
			for(int i=0;i<names.size();i++) {
				if(driver.getTitle().contains(names.get(i)))
					driver.close();
			}
		}
		
	}
}
