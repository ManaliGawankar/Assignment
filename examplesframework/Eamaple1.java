package examplesframework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Eamaple1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\setup\\Chromedriver file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationpractice.com/index.php");
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Women']"))).click().build().perform();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_13']")).click();
		Actions a1 =new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("(//a[@class='subcategory-name'][normalize-space()='Dresses'])[1]"))).click().build().perform();
		//driver.findElement(By.xpath("//a[@class='product_img_link']")).click();
		Thread.sleep(2000);
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,400)"); 
		//Thread.sleep(2000);
		Actions a2 =new Actions(driver);
		a2.moveToElement(driver.findElement(By.xpath("//a[@class='subcategory-name'][normalize-space()='Evening Dresses']"))).click().build().perform();
		//Thread.sleep(2000);
		//Actions a3 =new Actions(driver);
		//a3.moveToElement(driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_2']"))).click().build().perform();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='product_img_link']")).click();
		 Thread.sleep(2000);
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
        WebElement dressName=driver.findElement(By.tagName("h1"));
			
		System.out.println(dressName.getText());
		 
		 WebElement priceDress=driver.findElement(By.xpath("//span[@id='our_price_display']"));
		 
		 System.out.println(priceDress.getText());
		 WebElement modelNo=driver.findElement(By.xpath("//span[@itemprop='price']"));
		 
	     System.out.println(modelNo.getText());
		 WebElement condition=driver.findElement(By.xpath("//span[normalize-space()='New']"));
		
		 System.out.println(condition.getText());
		 WebElement description=driver.findElement(By.cssSelector("div[id='short_description_content'] p"));
			
		 System.out.println(description.getText());
		 		 		 				 
		WebElement Dropdown1 = driver.findElement(By.xpath("//select[@id='group_1']"));
		Select dropdown =new Select(Dropdown1);
		dropdown.selectByVisibleText("M");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		Actions a4 =new Actions(driver);
		a4.moveToElement(driver.findElement(By.cssSelector("button[name='Submit'] span"))).click().build().perform();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
		Actions a5 =new Actions(driver);
		a5.moveToElement(driver.findElement(By.xpath("//a[@title='View my shopping cart']"))).click().build().perform();
		Thread.sleep(2000);
		Actions a6 =new Actions(driver);
		a6.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Check out']"))).click().build().perform();
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,500)"); 
		Actions a7 =new Actions(driver);
		a7.moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"))).click().build().perform();
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("window.scrollBy(0,500)"); 
		Actions a8 =new Actions(driver);
		a8.moveToElement(driver.findElement(By.xpath("(//input[@id='email_create'])[1]"))).click().build().perform();
		a8.sendKeys("manali25gawankar@gmail.com").build().perform();
		Actions a9 =new Actions(driver);
		a9.moveToElement(driver.findElement(By.xpath("(//span[normalize-space()='Create an account'])[1]"))).click().build().perform();
		//Actions a10 =new Actions(driver);
		//a10.moveToElement(driver.findElement(By.cssSelector("#id_gender2"))).click().build().perform();
		Actions a11 =new Actions(driver);
		a11.moveToElement(driver.findElement(By.xpath("//input[@id='customer_firstname']"))).click().build().perform();
		a11.sendKeys("Sonali").build().perform();
		Actions a12 =new Actions(driver);
		a12.moveToElement(driver.findElement(By.xpath("//input[@id='customer_lastname']"))).click().build().perform();
		a12.sendKeys("Gawankar").build().perform();
		Actions a13 =new Actions(driver);
		a13.moveToElement(driver.findElement(By.xpath("//input[@id='passwd']"))).click().build().perform();
		a13.sendKeys("Sonali1993").build().perform();
		Actions a14 =new Actions(driver);
		a14.moveToElement(driver.findElement(By.xpath("//input[@id='firstname']"))).click().build().perform();
		a14.sendKeys("Sonali").build().perform();
		Actions a15 =new Actions(driver);
		a15.moveToElement(driver.findElement(By.xpath("//input[@id='lastname']"))).click().build().perform();
		a15.sendKeys("Gawankar").build().perform();
		Actions a16 =new Actions(driver);
		a16.moveToElement(driver.findElement(By.xpath("(//input[@id='address1'])[1]"))).click().build().perform();
		a16.sendKeys("ABC roadline Mumbai").build().perform();
		Actions a17 =new Actions(driver);
		a17.moveToElement(driver.findElement(By.xpath("//input[@id='city']"))).click().build().perform();
		a17.sendKeys("Shimla").build().perform();
		WebElement Dropdown2 = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select dropdown2 =new Select(Dropdown2);
		dropdown2.selectByVisibleText("Colorado");
		Actions a18 =new Actions(driver);
		a18.moveToElement(driver.findElement(By.xpath("//input[@id='postcode']"))).click().build().perform();
		a18.sendKeys("41270").build().perform();
		Actions a19 =new Actions(driver);
		a19.moveToElement(driver.findElement(By.xpath("//input[@id='phone_mobile']"))).click().build().perform();
		a19.sendKeys("9433034797").build().perform();
		Actions a20 =new Actions(driver);
		a20.moveToElement(driver.findElement(By.xpath("//input[@id='alias']"))).click().build().perform();
		a20.sendKeys("My address").build().perform();
		Actions a21 =new Actions(driver);
		a21.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Register']"))).click().build().perform();
		JavascriptExecutor js4 = (JavascriptExecutor)driver;
		js4.executeScript("window.scrollBy(0,800)"); 
		
		
		Actions a22 =new Actions(driver);
		a22.moveToElement(driver.findElement(By.xpath("//input[@type='checkbox']"))).click().build().perform();
		
		
		Actions a23 =new Actions(driver);
		a23.moveToElement(driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]"))).click().build().perform();
		
		
		JavascriptExecutor js5 = (JavascriptExecutor)driver;
		js5.executeScript("window.scrollBy(0,800)"); 
		
		
		Actions a24 =new Actions(driver);
		a24.moveToElement(driver.findElement(By.xpath("//a[@title='Pay by check.']"))).click().build().perform();
		
		
		Actions a25 =new Actions(driver);
		a25.moveToElement(driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"))).click().build().perform();
		
		//button[@class='button btn btn-default button-medium']
		Actions a26 =new Actions(driver);
		a26.moveToElement(driver.findElement(By.xpath("(//p[@class='alert alert-success'])[1]"))).build().perform();
		System.out.println(a26);
		
		driver.close();
		
	
	}
}
