package TestProject.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver getDriver(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elcot\\eclipse-workspace\\test\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		return driver;
		
	}
	public static void type(WebElement element, String name) {
		
   element.sendKeys(name);
	}
	public static void click(WebElement element) {
		element.click();

	}
	public static void quit(WebDriver driver) {
		driver.quit();

	}

}
