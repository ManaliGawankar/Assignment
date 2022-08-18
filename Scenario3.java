package seleniumassignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\setup\\Chromedriver file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://in.yahoo.com/";
		driver.manage().window().maximize();

		driver.get(Url);
		Thread.sleep(2000L);
		// verify the Trending Now
		if (driver.getPageSource().contains("Trending Now")) {
			System.out.println("Trending Now is present");
		} else {
			System.out.println("Trending Now is absent");
		}
		// Limiting webdriver
		// scope

		WebElement headerdriver = driver.findElement(By.xpath(" //ol[@class='reg searchBottom']"));// using rel Xpath
																												
																												
		System.out.println(headerdriver.findElements(By.tagName("a")).size());//total no.of links
		

		for (int i = 0; i < headerdriver.findElements(By.tagName("a")).size(); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			headerdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);

		} // opens all the tabs
		String parent = driver.getWindowHandle();
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while (it.hasNext()) {
			String child_window = it.next();
			driver.switchTo().window(child_window);
			System.out.println(driver.getTitle());
		}
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		// JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("window.scrollBy(500,0)");

		driver.findElement(By.cssSelector("a[title='COVID-19 in India']")).click(); //cssSelector
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(3000);

		System.out
				.println(driver.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).get(0).getText());
		System.out
				.println(driver.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td")).get(0).getText());
		System.out
				.println(driver.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).get(1).getText());
		System.out
				.println(driver.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td")).get(1).getText());
		System.out
				.println(driver.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td")).get(2).getText());
		System.out
				.println(driver.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).get(3).getText());
		System.out
				.println(driver.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td")).get(3).getText());
		System.out
				.println(driver.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td")).get(4).getText());
		driver.quit();// Exit the browser
	}

		

	}


	


