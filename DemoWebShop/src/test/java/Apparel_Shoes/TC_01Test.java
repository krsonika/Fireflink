package Apparel_Shoes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Lib.BaseUnit;
import generic_Lib.ReadData;
import pom_Repo.CommonPage;



public class TC_01Test extends BaseUnit{
	@Test
	public void apperal_Shoes() throws InterruptedException {
		//to click on apparel_shoes
		CommonPage h1=new CommonPage(driver);
		Thread.sleep(3000);
		h1.getApparelShoesNavBar().click();
		//checking weather it is navigating
		String actualurlOfApparelpage = driver.getCurrentUrl();
		Assert.assertEquals(ReadData.fromProperty("urlOfapparelPage"),actualurlOfApparelpage,"it is not navigating apparel and Shoes page");
		Reporter.log("navigating to apparel and shoes page",true);
		
	}

}
