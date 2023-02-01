package Apparel_Shoes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_Lib.Apparel_Shoes;
import generic_Lib.BaseUnit;
import pom_Repo.CommonPage;
@Test
public class TC_02 extends BaseUnit {
	public static void sortBy() throws InterruptedException {
	//clicking on apparel_shoes
	CommonPage h1=new CommonPage(driver);
	Thread.sleep(3000);
	h1.getApparelShoesNavBar().click();
	//click on sortBy dropdown
	Apparel_Shoes a1=new Apparel_Shoes(driver);
	a1.getsortBy().click();
	WebElement sortBy = driver.findElement(By.xpath("//span[text()='Sort by']/..//select[@id='products-orderby']"));
	
	Select multiSelect=new Select(sortBy);
	System.out.println("is Multi select dropdown is:"+multiSelect.isMultiple());
	
	List<WebElement> multiSelectOption = multiSelect.getOptions();
	WebElement top = driver.findElement(By.xpath("(//div[@class='details'])[1]/h2"));
    String TopLink = top.getText();
    System.out.println(TopLink);
	multiSelect.selectByIndex(2);
	WebElement hat = driver.findElement(By.xpath("//a[text()='Wool Hat']"));
	String hatLink = hat.getText();
	System.out.println(hatLink);
	Assert.assertNotEquals(TopLink, hatLink,"sorting is successful");
	multiSelect.selectByIndex(3);
	WebElement pant=driver.findElement(By.xpath("//a[text()='Blue Jeans']"));
	String pantLink = pant.getText();
	Assert.assertNotEquals(TopLink, pantLink,"sorting is successful");
	
	
	}
}
