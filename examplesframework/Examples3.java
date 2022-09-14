package examplesframework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Examples3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\setup\\Chromedriver file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//input[@name='img']"))).click().build().perform();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\Selenium\\setup\\Autoit\\Autoit file\\fileupload.exe");
            
	
	}
	

}
