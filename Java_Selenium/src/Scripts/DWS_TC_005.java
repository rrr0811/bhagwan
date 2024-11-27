package Scripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import elementRepo.BasePage;
import elementRepo.ElectronicsPage;
import elementRepo.ProductPage;
import elementRepo.ProductsListPage;
import elementRepo.WishListPage;
import generic_lib.BaseScript;

public class DWS_TC_005 extends BaseScript{
	//Verify user is able to add the product  from a category to Wish list section".
	@Test
	public void productToCartSection() {
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(loginpage.getLogoutlink().isEnabled(),"login not successfull");
		BasePage basepage=new BasePage(driver);
		basepage.getElectronicsLink().click();
		ElectronicsPage electronicspage=new ElectronicsPage(driver);
		electronicspage.getCellPhonesLink().click();
		ProductsListPage productlistPage=new ProductsListPage(driver);
		String ProductName=productlistPage.getProductName().getText();
		productlistPage.getProductName().click();
		ProductPage productpage=new ProductPage(driver);
		productpage.getAddToWishListButton().click();
		basepage.getWishlistLink().click();
		WishListPage wishlistpage= new WishListPage(driver);
		List<WebElement> productslist=wishlistpage.getProductNames();
		for(WebElement product : productslist) {
			if(product.getText().equalsIgnoreCase(ProductName))
				Reporter.log(ProductName+" is found", true);
		}
		
	}
}
