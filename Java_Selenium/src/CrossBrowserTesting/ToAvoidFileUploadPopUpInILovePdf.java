package CrossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToAvoidFileUploadPopUpInILovePdf {
	@Parameters("bname")
	@Test
	public void fileUpload(@Optional("chrome") String browserName) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			Reporter.log("invalid browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		WebElement uploadButton = driver.findElement(By.xpath("//span[text()='Select PDF file']/../..//input"));
		uploadButton.sendKeys("C:\\Users\\Harsha GR\\Downloads\\Harshavardhan_G_R_resume.pdf");
		driver.quit();
	}
}
