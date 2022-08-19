package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddtoBagPage {
	
	public WebDriver driver;
	
	By selectSize=By.xpath("//p[text()='L'and@class='size-buttons-unified-size']");
	By addToBagBtn=By.xpath("//div[text()='ADD TO BAG']");
	By openBag=By.xpath("//span[text()='Bag']");
	By wishlistBtn=By.xpath("//span[text()='WISHLIST']");
	
	
	public AddtoBagPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	

	public WebElement getselectSize()
	{
		return driver.findElement(selectSize);
	}
	
	
	
	

	public WebElement getaddToBagBtn() {
		// TODO Auto-generated method stub
		return driver.findElement(addToBagBtn);
	}
	
	public WebElement getopenBag() {
		// TODO Auto-generated method stub
		return driver.findElement(openBag);
	}
	
	public WebElement getwishlistBtn() {
		// TODO Auto-generated method stub
		return driver.findElement(wishlistBtn);
	}
	
	
}

