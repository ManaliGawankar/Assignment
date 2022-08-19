package Academy.MyntraFramework;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObject.AddtoBagPage;
import pageObject.CategoriesPage;
import pageObject.LandingPage;
import resources.base;

public class HomePage extends base{
	
	public static Logger Log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		Log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to HomePage");
	}
	
	@Test
	
	public void basePageNavigation() throws IOException, InterruptedException
	{
		
		
		LandingPage l=new LandingPage(driver);
		l.getMen();
		l.getAction();
		l.gettshirtLink().click();
		
		CategoriesPage c=new CategoriesPage(driver);
		c.getsortByDropdown().click();
		Thread.sleep(2000);
		c.getfilter1().click();
		Thread.sleep(2000);
		c.getfilter2().click();
		Thread.sleep(2000);
		c.getfilter3().click();
		Thread.sleep(2000);
		c.getchooseItem().click();
		
		AddtoBagPage a=new AddtoBagPage(driver);
		Set<String> window = driver.getWindowHandles();
		 Iterator<String> itr = window.iterator();
		 String win[] = new String[5];
		 for(int i=0; i<window.size();i++)
		 {
		 win[i] = itr.next();
		 }
		 driver.switchTo().window(win[1]);

		 Thread.sleep(1000);
		 
		 a.getselectSize().click();
		 Thread.sleep(1000);
		 a.getaddToBagBtn().click();
		 a.getopenBag().click();
		 Thread.sleep(2000);
		 
		 driver.navigate().back();
		 a.getwishlistBtn().click();
		 
		 
		 
		 
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	

}
