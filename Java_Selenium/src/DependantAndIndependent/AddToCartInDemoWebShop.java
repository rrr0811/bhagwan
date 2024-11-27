package DependantAndIndependent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartInDemoWebShop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']")).click();
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
		driver.findElement(By.xpath("//a[text()='Smartphone']/../..//input[@value='Add to cart']")).click();
		driver.findElement(By.partialLinkText("JEWELRY")).click();
		driver.findElement(By.xpath("//a[text()='Black & White Diamond Heart']/../..//input[@value='Add to cart']")).click();
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='product-unit-price']"));
		ArrayList al=new ArrayList();
		for(WebElement price: prices) {
			al.add(Double.parseDouble(price.getText()));
		}
		Collections.sort(al);
		System.out.println(al);
		driver.findElement(By.xpath("//span[contains(text(),'"+al.get(0)+"')]/../..//input[@name='removefromcart']")).click();
		driver.findElement(By.name("updatecart")).click();
	}
}
