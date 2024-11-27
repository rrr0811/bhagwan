package DependantAndIndependent;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HistoricGoldRate {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
			List<WebElement> tableRows = driver.findElement(By.xpath("(//table)[2]")).findElements(By.xpath("tbody /tr"));
			for(WebElement tableRow:tableRows) {
				System.out.print(tableRow.findElement(By.xpath("td[1]")).getText()+" - ");
				System.out.println(tableRow.findElement(By.xpath("td[2]/div[contains(text(),'₹')]")).getText());
			}
	}
}
