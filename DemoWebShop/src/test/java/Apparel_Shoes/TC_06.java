package Apparel_Shoes;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Lib.Apparel_Shoes;
import generic_Lib.BaseUnit;
import pom_Repo.CommonPage;

public class TC_06 extends BaseUnit{
	@Test
	public static void AddToCart() throws InterruptedException {
		CommonPage h1=new CommonPage(driver);

		//to click on apparel_shoes 
		h1.getApparelShoesNavBar().click();
		//to click on product
		Apparel_Shoes a1=new Apparel_Shoes(driver);
		a1.getProduct().click();
		//to click on add to cart button
		a1.getAddToCart().click();
		boolean check = a1.getNotification().isDisplayed();
		Assert.assertEquals(check, true,"notification is not displayed");
		Reporter.log("notification is displayed",true);
		

}
}
