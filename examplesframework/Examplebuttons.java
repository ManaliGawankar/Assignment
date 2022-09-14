package examplesframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examplebuttons {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\setup\\Chromedriver file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[text()='Button']")).click();
		Thread.sleep(2000);
		
		WebElement ifrm = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(ifrm);
		//Thread.sleep(2000);
		
		WebElement btn = driver.findElement(By.xpath("(//button[text()='A button element'])[1]"));;
		btn.click();
		Thread.sleep(1000);
		
		WebElement submittn = driver.findElement(By.xpath("(//input[@value='A submit button'])[1]"));
		submittn.click();
		Thread.sleep(1000);
		
		WebElement anchorBtn = driver.findElement(By.xpath("(//a[text()='An anchor'])[1]"));
		anchorBtn.click();
		Thread.sleep(1000);
		WebElement CssBtn = driver.findElement(By.xpath("(//button[text()='A button element'])[2]"));
		CssBtn.click();
		Thread.sleep(1000);
		
		WebElement CssSubBtn = driver.findElement(By.xpath("(//input[@value='A submit button'])[2]"));
		CssSubBtn.click();
		Thread.sleep(1000);
		
		WebElement CssAnchor = driver.findElement(By.xpath("(//a[text()='An anchor'])[2]"));
		CssAnchor.click();
		
	}



}
