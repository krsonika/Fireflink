package Apparel_Shoes;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Lib.Apparel_Shoes;
import generic_Lib.BaseUnit;
import generic_Lib.ReadData;
import pom_Repo.CommonPage;

public class TC_09 extends BaseUnit {
	@Test
	public static void Email() throws InterruptedException {
		CommonPage h1=new CommonPage(driver);

		//to click on apparel_shoes 
		h1.getApparelShoesNavBar().click();
		//to click on product
		Apparel_Shoes a1=new Apparel_Shoes(driver);
		a1.getProduct().click();
		//to click on email a friend button
		a1.getEmail().click();
		//compare the url
		String ActualUrlOfEmailPage = driver.getCurrentUrl();
		Reporter.log(ActualUrlOfEmailPage,true);
		Assert.assertEquals(ActualUrlOfEmailPage,ReadData.fromProperty("EmailPageurl"),"it is not navigating to Email page" );
		Reporter.log("it is navigating to CompareList Page when we clicks on Email a Friend button",true);
		}

}

