package Apparel_Shoes;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Lib.Apparel_Shoes;
import generic_Lib.BaseUnit;
import generic_Lib.ReadData;
import pom_Repo.CommonPage;

	public class TC_04Test extends BaseUnit{
		@Test
		public static void Display() throws InterruptedException {
		//click on apparel_shoes 
		CommonPage h1=new CommonPage(driver);
		Thread.sleep(3000);
		h1.getApparelShoesNavBar().click();
		Thread.sleep(2000);
		// click on display dropdown
		Apparel_Shoes a1=new Apparel_Shoes(driver);	
		a1.getDisplay().click();
		WebElement Display = a1.getDisplay();
		Select multiSelect=new Select(Display);
		Reporter.log("is Multi select dropdown is:"+multiSelect.isMultiple());
		List<WebElement> multiSelectOption = multiSelect.getOptions();
		// to select 4 in display dropdown
		multiSelect.selectByIndex(0);
		String four = driver.getCurrentUrl();
		//System.out.println(four);
		Assert.assertEquals(ReadData.fromProperty("Display4"),four,"disply dropdown not work properly");
		Reporter.log("dropdown working properly",true);
		//to select 8 in display dropdown
		multiSelect.selectByIndex(1);
		String eight = driver.getCurrentUrl();
		Assert.assertEquals(ReadData.fromProperty("Display8"),eight,"disply dropdown not work properly");
		Reporter.log("dropdown working properly when selects 8",true);
		// to select 8 in display dropdown
		multiSelect.selectByIndex(2);
		String Twelve = driver.getCurrentUrl();
		Assert.assertEquals(ReadData.fromProperty("Display12"),Twelve,"disply dropdown not work properly");
		Reporter.log("dropdown working properly when selects 12",true);

		
	
			

}
	}
