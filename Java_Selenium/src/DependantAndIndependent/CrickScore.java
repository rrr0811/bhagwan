package DependantAndIndependent;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickScore {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/series/australia-in-india-2023-24-1389381/india-vs-australia-5th-t20i-1389395/full-scorecard");
		WebElement table = driver.findElement(By.xpath("(//table)[1]/tbody"));
		List<WebElement> runs=table.findElements(By.xpath("tr/td[3]"));
		for(WebElement run: runs) {
			System.out.print(run.findElement(By.xpath("../td[1]")).getText()+" - ");
			System.out.println(run.getText());
		}
	}
}
