package Apparel_Shoes;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Lib.Apparel_Shoes;
import generic_Lib.BaseUnit;
import pom_Repo.CommonPage;

public class TC_07 extends BaseUnit {
	@Test
	public static void Wishlist() throws InterruptedException {
		CommonPage h1=new CommonPage(driver);

		//to click on apparel_shoes 
		h1.getApparelShoesNavBar().click();
		//to click on product
		Apparel_Shoes a1=new Apparel_Shoes(driver);
		a1.getProduct().click();
		a1.getWishList().click();
		boolean check1 = a1.getWishListNotification().isDisplayed();
		Assert.assertEquals(check1, true,"wishlist notification is not displayed");
		Reporter.log("wishlist notification is displayed",true);
		}
}
