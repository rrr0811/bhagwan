package Scripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic_lib.BaseScript;

public class DWS_TC_001 extends BaseScript{
	
	//Test Scenario: Verify User is able to Login with valid credentials.
	@Test
	public void loginWithValidCredentials() {
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(loginpage.getLogoutlink().isEnabled(),"login not successfull");
		softassert.assertAll();
	}
}
