package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAttributeValuesUsinggetMethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//to capture tooltip text
		driver.get("https://www.woodenstreet.com/");
		System.out.println("tool tip text : "+driver.findElement(By.xpath("//img[@title='Wooden TV Unit']")).getAttribute("title"));
		
		//to capture alt of image
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.kalkifashion.com/in/");
		System.out.println("alt : "+driver.findElement(By.xpath("//img[@alt='Wedding Suits']")).getAttribute("alt"));
		
		//to capture value in a search bar
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nykaafashion.com/");
		WebElement searchBox = driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));
		searchBox.sendKeys("oversized t-shirts");
		System.out.println("search value : "+searchBox.getAttribute("value"));
	}
}
