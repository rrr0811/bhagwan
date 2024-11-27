package Scripts;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import elementRepo.BasePage;
import elementRepo.CheckOutPage;
import elementRepo.ElectronicsPage;
import elementRepo.OrderPlacedPage;
import elementRepo.ProductsListPage;
import elementRepo.ShoppingCartPage;
import generic_lib.BaseScript;

public class DWS_TC_007 extends BaseScript{
	//Verify user is able to place order with Cash on Delivery Payment  method.
	@Test
	public void placingOrderWithCashOnDelivery() {
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(loginpage.getLogoutlink().isEnabled(),"login not successfull");
		BasePage basepage=new BasePage(driver);
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
	}
}
