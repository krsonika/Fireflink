package Apparel_Shoes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Lib.Apparel_Shoes;
import generic_Lib.BaseUnit;
import generic_Lib.ReadData;
import pom_Repo.CommonPage;

public class TC_05 extends BaseUnit{
	@Test
		public static void Product() throws InterruptedException {
		// to click on apparel_shoes 
		CommonPage h1=new CommonPage(driver);
		Thread.sleep(3000);
		h1.getApparelShoesNavBar().click();
		Thread.sleep(2000);
		// to click o product
		Apparel_Shoes a1=new Apparel_Shoes(driver);
		a1.getProduct().click();
		String ActualUrlOfPage = driver.getCurrentUrl();
		Reporter.log(ActualUrlOfPage,true);
		Assert.assertEquals(ActualUrlOfPage,ReadData.fromProperty("Pageurl"),"it is not navigating to next page" );
		Reporter.log("it is navigating to next when we clicks on product",true);
		}
	}


