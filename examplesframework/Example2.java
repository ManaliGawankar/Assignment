package examplesframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2 {
	public static void main(String[] args) throws Exception {
	    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\setup\\Chromedriver file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		Thread.sleep(2000);
		
		WebElement ifrm = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(ifrm);
		Thread.sleep(2000);

		WebElement DragEle = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement desti = driver.findElement(By.xpath("//html[@lang='en']"));
		Actions a =new Actions(driver);
		a.moveToElement(DragEle).dragAndDrop(DragEle,desti).build().perform();
		

	}



}
