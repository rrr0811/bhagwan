package Scripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import elementRepo.BasePage;
import elementRepo.ElectronicsPage;
import elementRepo.ProductsListPage;
import elementRepo.ShoppingCartPage;
import generic_lib.BaseScript;

public class DWS_TC_003 extends BaseScript{
	//Verify user is able to add the product to the Cart section.
	@Test
	public void productToCartSection() {
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(loginpage.getLogoutlink().isEnabled(),"login not successfull");
		BasePage basepage=new BasePage(driver);
		basepage.getElectronicsLink().click();
		ElectronicsPage electronicspage=new ElectronicsPage(driver);
		electronicspage.getCellPhonesLink().click();
		ProductsListPage productlistPage=new ProductsListPage(driver);
		String productName=productlistPage.getProductName().getText();
		productlistPage.getAddToCartButton().click();
		basepage.getShoppingCartLink().click();
		ShoppingCartPage shoppingcartpage=new ShoppingCartPage(driver);
		List<WebElement> productslist=shoppingcartpage.getProductNames();
		for(WebElement product   :  productslist) {
			if(product.getText().equalsIgnoreCase(productName))
				Reporter.log(productName + " found" , true);
		}
		
	}
}
