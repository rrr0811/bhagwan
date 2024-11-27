package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckandWorkOnBooleanMethods2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		WebElement rad = driver.findElement(By.xpath("//input[@value='rad']"));
		WebElement deg = driver.findElement(By.xpath("//input[@value='deg']"));
		for(int i=1;i<5;i++) {
		if(deg.isEnabled())
			rad.click();
		if(rad.isEnabled())
			deg.click();
		}
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		WebElement checkBox = driver.findElement(By.id("caddoptional"));
		WebElement checkBoxClick=driver.findElement(By.xpath("//input[@id='caddoptional'] /.. /span"));
		checkBoxClick.click();
	}
}
