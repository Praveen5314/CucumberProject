package SingleSelect;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import TestProject.Sample.BaseClass;

public class DropdownTask extends BaseClass {
	static WebDriver driver=null;
	static Select s;
	static WebElement ddnCountry;
	public static void ddwnSize()
	{
	    s=new Select(ddnCountry);
		List<WebElement> lstCountry=s.getOptions();
		System.out.println("Dropdown size is" + lstCountry.size());
	}
	public static void textBasedSelect()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Country");
		String cntry=sc.next();
		sc.close();
		s.selectByValue(cntry);
		WebElement selectedOption = s.getFirstSelectedOption();
		
		System.out.println(selectedOption.getAttribute("value"));
	}
public static void main(String[] args) throws InterruptedException {
	
    driver = getDriver("http://demoqa.com/registration/");
    ddnCountry=driver.findElement(By.id("dropdown_7"));
	ddwnSize();
	Thread.sleep(3000);
	textBasedSelect();
	quit(driver);
	/*for(WebElement x:lstCountry)
	{
		if(x.getAttribute("value")==cntry)
			s.selectByVisibleText(cntry);
	}
	if(ddnCountry.isSelected())
	{
		System.out.println("Country is selected");
	}
	else
	{
		System.out.println(" Input is Invalid");
	}*/
}
}
