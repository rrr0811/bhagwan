package generic_lib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import elementRepo.LoginPage;

public class BaseScript {
	
	public WebDriver driver;
	public WebDriverWait explicitWait;
	public String url="https://demowebshop.tricentis.com/";
	public LoginPage loginpage;

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("from before suite", true);
		Reporter.log("reporter config");
		Reporter.log("JDBC connection");
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("from before test", true);
	}

	//@Parameters("browser")
	@BeforeClass
	public void beforeClass() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("from before method", true);
		driver.get(url);
		loginpage=new LoginPage(driver);
		loginpage.getLoginLink().click();
		loginpage.getEmailTextBox().sendKeys("sayalipagare99@gmail.com");
		loginpage.getPasswordTextBox().sendKeys("saya21");
		loginpage.getLoginButton().click();
		
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("from after suite", true);
		Reporter.log("flush reporter");
		Reporter.log("closing JDBC connection");
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("from after test", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("from after class", true);
		Reporter.log("close browser", true);
		//driver.quit();
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("from after method", true);
		//loginpage.getLogoutlink().click();
	}
}
