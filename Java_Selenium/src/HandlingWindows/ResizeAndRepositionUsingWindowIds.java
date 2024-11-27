package HandlingWindows;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeAndRepositionUsingWindowIds {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Java_Selenium/Resources/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> allWindowIds = driver.getWindowHandles();
		int height=500;
		int width=500;
		int X=200;
		int Y=200;
		for(String windowId: allWindowIds) {
			driver.switchTo().window(windowId);
			driver.manage().window().setSize(new Dimension(width, height));
			driver.manage().window().setPosition(new Point(X, Y));
			height+=100;
			width+=100;
			X+=150;
			Y+=150;
			Thread.sleep(1000);
			driver.close();
		}
		
	}
}
