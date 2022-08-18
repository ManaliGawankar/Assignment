package seleniumassignment;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scenario2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\setup\\Chromedriver file\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//h4[text()='Trending searches']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//h4[text()='Trending searches']")).getText(),
				"Trending searches");
		WebElement columndriver = driver.findElement(By.cssSelector("ol[class='reg searchBottom']"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		for (int i = 0; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);

		}
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
		

		driver.findElement(By.xpath("//a[@title='COVID-19 in India']")).click(); //Rel Xpath
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
		driver.quit();
	}

}
