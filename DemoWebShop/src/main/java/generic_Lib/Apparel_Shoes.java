package generic_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Apparel_Shoes {
	

	public Apparel_Shoes(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath = "//select[@id='products-orderby']") 
		private WebElement sortBy;

		public WebElement getsortBy() {
			return sortBy;
		}
		@FindBy(id="products-viewmode")
		private WebElement viewAs;

		
		public WebElement getviewAs() {
			return viewAs;
		}
		@FindBy(id="products-pagesize")
		private WebElement Display;

		
		public WebElement getDisplay() {
			return Display;
		}
		
		@FindBy(xpath="(//div[@class='product-item'])[1]")
		private WebElement Product;

			
		public WebElement getProduct() {
			return Product;
		}
		@FindBy(id="add-to-cart-button-5")
		private WebElement AddToCart;

			
		public WebElement getAddToCart() {
			return AddToCart;
		}
		@FindBy(xpath="//p[@class='content']")
		private WebElement Notification;

			
		public WebElement getNotification() {
			return Notification;
	}
		@FindBy(id="add-to-wishlist-button-5")
		private WebElement WishList;

			
		public WebElement getWishList() {
			return WishList ;
	}
		@FindBy(xpath="//a[text()='wishlist']")
		private WebElement WishListNotification;

			
		public WebElement getWishListNotification() {
			return WishListNotification ;
	}
		@FindBy(xpath="//input[@class='button-2 add-to-compare-list-button']")
		private WebElement CompareList;

			
		public WebElement getCompareList() {
			return CompareList ;
	}
		@FindBy(xpath="//input[@class='button-2 email-a-friend-button']")
		private WebElement Email;

			
		public WebElement getEmail() {
			return Email ;
	}
}



