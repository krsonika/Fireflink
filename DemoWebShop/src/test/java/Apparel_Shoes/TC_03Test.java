package Apparel_Shoes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_Lib.Apparel_Shoes;
import generic_Lib.BaseUnit;
import generic_Lib.ReadData;
import pom_Repo.CommonPage;

public class TC_03Test extends BaseUnit{
	@Test
	public static void viewAs() throws InterruptedException {
		//click on apparel_shoes
		CommonPage h1=new CommonPage(driver);
		Thread.sleep(3000);
		h1.getApparelShoesNavBar().click();
		Thread.sleep(2000);
		//click on viewas dropdown
		Apparel_Shoes a1=new Apparel_Shoes(driver);	
		a1.getviewAs().click();
		
		WebElement viewAs = a1.getviewAs();
		Select multiSelect=new Select(viewAs);
		Reporter.log("is Multi select dropdown is:"+multiSelect.isMultiple());
		
		List<WebElement> multiSelectOption = multiSelect.getOptions();
		multiSelect.selectByIndex(1);
		String List = driver.getCurrentUrl();
		Assert.assertEquals(ReadData.fromProperty("List"), List,"viewAsDropdown not working properly");
		Reporter.log("viewAs Dropdown works properly when we selects List",true);
		Select multiSelect1=new Select(viewAs);
		multiSelect1.selectByIndex(0);
		String Grid = driver.getCurrentUrl();
		Assert.assertEquals(ReadData.fromProperty("Grid"),Grid,"viewAsDropdown not working properly");
		Reporter.log("viewAs Dropdown works properly when we selects Grid",true);
		
	}

}
