package examplesframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examplebuttons2 {
	
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\setup\\Chromedriver file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Checkboxradio']")).click();
		Thread.sleep(2000);
		
		WebElement ifrm = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(ifrm);
		//Thread.sleep(2000);

		
		driver.findElement(By.xpath("//label[@for='radio-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='checkbox-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='checkbox-nested-1']")).click();
		Thread.sleep(2000);

		driver.close();
	}



}
