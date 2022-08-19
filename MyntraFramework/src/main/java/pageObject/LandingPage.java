package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LandingPage {
	
	public WebDriver driver;
	
	By Men=By.xpath("//a[text()='Men'and@class='desktop-main']");
	By tshirtLink=By.xpath("//a[text()='T-Shirts'and@class='desktop-categoryLink']");
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	

	public WebElement getMen()
	{
		return driver.findElement(Men);
	}
	
	public void getAction()
	{
		Actions a=new Actions(driver);
		 a.moveToElement(getMen()).build().perform();
	}
	
	

	public WebElement gettshirtLink() {
		// TODO Auto-generated method stub
		return driver.findElement(tshirtLink);
	}
	
}

