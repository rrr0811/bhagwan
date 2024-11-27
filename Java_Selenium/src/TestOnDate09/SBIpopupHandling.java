package TestOnDate09;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SBIpopupHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./DRivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
		//explicitWait.until(ExpectedConditions.);
		Thread.sleep(3000);
		Set<String> allWindowsId = driver.getWindowHandles();
		for(String windowId: allWindowsId) {
			if(driver.switchTo().window(windowId).getCurrentUrl().contains("troubleloginhome")){
				driver.findElement(By.id("nextStep")).click();
				break;
			}
		}
		Dimension windowSize=driver.manage().window().getSize();
		driver.manage().window().setSize(new Dimension(windowSize.getWidth()+100, windowSize.getHeight()+100));
		WebElement userName = driver.findElement(By.id("userName"));
		WebElement submitBtn = driver.findElement(By.id("go"));
		System.out.println("====invalid for username====");
		userName.clear();
		userName.sendKeys("");
		submitBtn.click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("=====valid data entered in username====");
		userName.clear();
		userName.sendKeys("harsha");
		submitBtn.click();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("=====invalid for accountNumber====");
		WebElement accountNo = driver.findElement(By.id("accountNo"));
		accountNo.clear();
		accountNo.sendKeys("12345");
		submitBtn.click();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("====valid data entered in accountNumber====");
		accountNo.clear();
		accountNo.sendKeys("12112112111");
		submitBtn.click();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("====Selected country: India====");
		Select countryDropDown=new Select(driver.findElement(By.id("selCountry")));
		countryDropDown.selectByValue("91");
		submitBtn.click();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("====Invalid mobile No====");
		WebElement mobile = driver.findElement(By.id("mobileNo"));
		mobile.clear();
		mobile.sendKeys("hars");
		submitBtn.click();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("====valid data entered in mobile No====");
		mobile.clear();
		mobile.sendKeys("6360561209");
		submitBtn.click();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("====Invalid date of birth====");
		WebElement dob = driver.findElement(By.id("datepicker5"));
		dob.clear();
		dob.sendKeys("30/02/2001");
		submitBtn.click();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("====valid data entered in date of birth====");
		dob.clear();
		dob.sendKeys("08/11/2001");
		submitBtn.click();
		System.out.println(alert.getText());
		alert.accept();
		
	}
}
