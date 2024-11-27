package Scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import elementRepo.BasePage;
import elementRepo.CheckOutPage;
import elementRepo.ElectronicsPage;
import elementRepo.OrderPlacedPage;
import elementRepo.ProductsListPage;
import elementRepo.RegisterPage;
import elementRepo.ShoppingCartPage;

public class DWS_TC_006{
	
	//Verify user is able to register and log in with the registered credentials and add a product to cart and buy it..
	@Test
	public void registerAndLoginAndBuy(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com");
		BasePage basepage=new BasePage(driver);
		basepage.getRegisterLink().click();
		RegisterPage registerpage=new RegisterPage(driver);
		registerpage.getMaleradioButton().click();
		registerpage.getFirstNameTextBox().sendKeys("Harsha");
		registerpage.getLastNameTextBox().sendKeys("G R");
		registerpage.getEmailTextBox().sendKeys("harsh61@gmail.com");
		registerpage.getPasswordTextBox().sendKeys("Harsh008");
		registerpage.getConfirmPasswordTextBox().sendKeys("Harsh008");
		registerpage.getRegisterButton().click();
		basepage.getElectronicsLink().click();
		ElectronicsPage electronicspage=new ElectronicsPage(driver);
		electronicspage.getCellPhonesLink().click();
		ProductsListPage productlistPage=new ProductsListPage(driver);
		productlistPage.getAddToCartButton().click();
		basepage.getShoppingCartLink().click();
		ShoppingCartPage shoppingcartpage=new ShoppingCartPage(driver);
		shoppingcartpage.getTermsOfServiceCheckBox().click();
		shoppingcartpage.getCheckoutButton().click();
		CheckOutPage checkoutpage = new CheckOutPage(driver);
		Select select=new Select(checkoutpage.getBillingCountryDropdown());
		select.selectByVisibleText("India");
		checkoutpage.getBillingCity().sendKeys("Bangalore");
		checkoutpage.getBillingAddress1().sendKeys("kattrigupe");
		checkoutpage.getBillingZipCode().sendKeys("560100");
		checkoutpage.getBillingPhoneNumber().sendKeys("6360561209");
		checkoutpage.getBillingContinueButton().click();
		checkoutpage.getShippingAddressContinue().click();
		checkoutpage.getShippingMethodContinue().click();
		checkoutpage.getPaymentMethodContinue() .click();
		checkoutpage.getPaymentInformationContinue().click();
		checkoutpage.getConfirmOrderConfirm().click();
		OrderPlacedPage orderplacedpage=new OrderPlacedPage(driver);
		String msg=orderplacedpage.getOrderConfirmationText().getText();
		Reporter.log(msg,true);
		basepage.getLogoutlink();
		driver.quit();
	}
}
