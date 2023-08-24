package TestScripts;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class AddToCartTest extends BaseClass {
	@Test
	public void addToCartTest() {
		Map<String,String> map=excel.getData("Sheet1","Add Address");
		welcome.clickLoginButton();
		login.loginToApp(map.get("Email"),map.get("password"));
		Thread.sleep(2000);
		home.moouseHoverToElectronic(webutil);
		Thread.sleep(2000);
		home.clickHeadPhoneLink();
		headphone.clickAddCart();
		Thread.sleep(2000);
		Assert.assertEquals(headphone.getAddToCartText(), "ADDED");
		headphone.clickCartIcon();
		Assert.assertTrue(cart.getCartItem().equalsIgnoreCase(itemName));
		
		
	}

}
