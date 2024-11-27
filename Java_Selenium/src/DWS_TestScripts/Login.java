package DWS_TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import elementRepo.LoginPage;

public class Login {
	@Test
	public void login(){
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getLoginLink().click();
		loginpage.getEmailTextBox().sendKeys("admin02@gmail.com");
		loginpage.getPasswordTextBox().sendKeys("Admin02");
		loginpage.getRememberMeCheckBox().click();
		loginpage.getLoginButton().click();
	}
	
}
