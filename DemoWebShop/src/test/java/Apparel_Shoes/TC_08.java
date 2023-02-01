package Apparel_Shoes;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Lib.Apparel_Shoes;
import generic_Lib.BaseUnit;
import generic_Lib.ReadData;
import pom_Repo.CommonPage;

public class TC_08 extends BaseUnit{
	@Test
	public static void CompareList() throws InterruptedException {
		CommonPage h1=new CommonPage(driver);

		//to click on apparel_shoes 
		h1.getApparelShoesNavBar().click();
		//to click on product
		Apparel_Shoes a1=new Apparel_Shoes(driver);
		a1.getProduct().click();
		a1. getCompareList().click();
		String ActualUrlOfComparePage = driver.getCurrentUrl();
		Reporter.log(ActualUrlOfComparePage,true);
		Assert.assertEquals(ActualUrlOfComparePage,ReadData.fromProperty("ComparePageurl"),"it is not navigating to Compare page" );
		Reporter.log("it is navigating to CompareList Page when we clicks on CompareList",true);
		}
		

}

