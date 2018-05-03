package MultipleSelect;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestProject.Sample.BaseClass;

public class MultipleSelectClass extends BaseClass {
	
	
	public static void TextBasedSelect()
	{
		WebDriver driver=getDriver("http://toolsqa.com/automation-practice-form/");
	    WebElement ddnSeleniumCmds=driver.findElement(By.id("selenium_commands"));
		Select s=new Select(ddnSeleniumCmds);
		List<WebElement> options = s.getOptions();
		System.out.println("Given Values");
		for(WebElement x:options)
		{
			System.out.println(x.getAttribute("value"));
		}
		System.out.println("Enter the Inputs From given values ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.next();
		sc.close();
		s.selectByVisibleText(s1);
		s.selectByVisibleText(s2);
		quit(driver);
	}
	public static void printLastAndSecondSelect()
	{
		WebDriver driver=getDriver("http://toolsqa.com/automation-practice-form/");
	    WebElement ddnSeleniumCmds=driver.findElement(By.id("selenium_commands"));
		Select s=new Select(ddnSeleniumCmds);
		List<WebElement> options1 = s.getOptions();
		System.out.println("Given Values");
		for(WebElement x:options1)
		{
			s.selectByVisibleText(x.getAttribute("value"));
		}
		int size=options1.size();
		for(int i=0;i<size;i++)
		{
			if(i==1)
			{
				System.out.println(options1.get(i).getText());
			}
			if(i == size-1)
			{
				System.out.println("The Last select value is " + options1.get(i).getText());
			}
		}
		quit(driver);
	}
public static void main(String[] args) {
       TextBasedSelect();
       printLastAndSecondSelect();
	
}
}
