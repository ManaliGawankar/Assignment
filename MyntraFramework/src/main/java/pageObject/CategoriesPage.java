package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CategoriesPage {
	
	public WebDriver driver;
	
	By sortByDropdown=By.xpath("//div[@class='sort-sortBy']");
	By filter1 =By.xpath("//label[text()='Puma']");
	By filter2=By.xpath("//label[text()='Black']");
	By filter3=By.xpath("//label[text()='10% and above']");
	By chooseItem=By.xpath("//img[@title='Puma Men Black Printed Detail Essentials Small Logo Cotton Pure Cotton T-shirt']");


	
	
	
	
	
	
	public CategoriesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	

	public WebElement getsortByDropdown()
	{
		return driver.findElement(sortByDropdown);
	}
	
	public void getAction()
	{
		Actions a=new Actions(driver);
		 a.moveToElement(getsortByDropdown()).build().perform();
		 a.sendKeys(Keys.DOWN).build().perform();
		 a.sendKeys(Keys.DOWN).build().perform();
		 a.sendKeys(Keys.ENTER).build().perform();
	}
	public WebElement getfilter1()
	{
		return driver.findElement(filter1);
	}
	
	public WebElement getfilter2()
	{
		return driver.findElement(filter2);
	}
	public WebElement getfilter3()
	{
		return driver.findElement(filter3);
	}
	public WebElement getchooseItem()
	{
		return driver.findElement(chooseItem);
	}





}

