package examplesframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExampleDragandDrop {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\setup\\Chromedriver file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/");
		WebElement dropeble = driver.findElement(By.xpath("//a[text()='Droppable']"));
		dropeble.click();
		
		WebElement ifrm = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(ifrm);
		Thread.sleep(2000);
		
		WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		Thread.sleep(2000);
		WebElement desti = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions a =new Actions(driver);
		a.moveToElement(drag).clickAndHold().moveToElement(desti).release().build().perform();
		

	}



}
