package seleniumassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenerio5Opera {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				
		
			System.setProperty("webdriver.opera.driver","D:\\Selenium\\setup\\operadriver file\\operadriver_win64.zip\\operadriver_win64\\operadriver.exe");
			WebDriver driver = new OperaDriver(); //open the browser
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.get("https://www.myntra.com/");

			 WebElement MenCategory =
			driver.findElement(By.xpath("//a[text()='Men'and@class='desktop-main']"));

			 Actions a = new Actions(driver);
			 a.moveToElement(MenCategory).build().perform();

			 WebElement tShirtLink =
			driver.findElement(By.xpath("//a[text()='T-Shirts'and@class='desktop-categoryLink']"));
			 tShirtLink.click();

			 WebElement sortByDropdown =
			driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
			 a.moveToElement(sortByDropdown).build().perform();

			 a.sendKeys(Keys.DOWN).build().perform();
			 a.sendKeys(Keys.DOWN).build().perform();
			 a.sendKeys(Keys.ENTER).build().perform();

			 //Filters of application
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//label[text()='Puma']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//label[text()='Black']")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//label[text()='10% and above']")).click();
			 Thread.sleep(2000);

			 WebElement chooseItem =
			driver.findElement(By.xpath("//img[@title='Puma Men Black Printed Detail Essentials Small Logo Cotton Pure Cotton T-shirt']"));
			 chooseItem.click();

			 //Switching of windows or child browser:
			 Set<String> window = driver.getWindowHandles();
			 Iterator<String> itr = window.iterator();
			 String win[] = new String[5];
			 for(int i=0; i<window.size();i++)
			 {
			 win[i] = itr.next();
			 }
			 driver.switchTo().window(win[1]);

			 Thread.sleep(1000);
			 WebElement selectSize =
			driver.findElement(By.xpath("//p[text()='L'and@class='size-buttons-unified-size']")
			);
			 Thread.sleep(1000);
			 selectSize.click();


			 WebElement addToBagBtn =
			driver.findElement(By.xpath("//div[text()='ADD TO BAG']"));
			 addToBagBtn.click();

			 WebElement openBag =
			driver.findElement(By.xpath("//span[text()='Bag']"));
			 openBag.click();

			 Thread.sleep(2000);
			 driver.navigate().back();

			 WebElement wishlistBtn =
			driver.findElement(By.xpath("//span[text()='WISHLIST']"));
			 wishlistBtn.click();


			 Thread.sleep(5000);
			 driver.quit();


			}
			
		}

		

	


