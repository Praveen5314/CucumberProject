package TestProject.Sample;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitions extends BaseClass {
	 WebDriver driver=null;
     WebElement firstName, lastName;
     Select s;
     WebElement option;
     String selectedValue;
     
     @Given("^the user in Demoqa Website$")
     public void the_user_in_Demoqa_Website()  {
	  driver=getDriver("http://demoqa.com/registration/");
	}

     @When("^the user enters FirstName and LastName$")
     public void the_user_enters_FirstName_and_LastName()  {
	     driver.findElement(By.id("name_3_firstname")).sendKeys("Praveen");
	     driver.findElement(By.id("name_3_lastname")).sendKeys("kumar");
	    
	}

     @Then("^the user verifies the entered text in FirstName and LastName$")
     public void the_user_verifies_the_entered_text_in_FirstName_and_LastName() 
	{
		Assert.assertEquals("Praveen", driver.findElement(By.id("name_3_firstname")).getAttribute("value"));
		Assert.assertEquals("kumar", driver.findElement(By.id("name_3_lastname")).getAttribute("value"));
		//quit(driver);
	   
	}
     @When("^the user choose Marital Status and Hobby$")
     public void the_user_choose_Marital_Status_and_Hobby()  {
	    driver.findElement(By.xpath("//input[@value='single']")).click();
	    driver.findElement(By.xpath("//input[@value='dance']")).click();
	}

     @Then("^the user verifies the selected Marital Status and Hobby$")
     public void the_user_verifies_the_selected_Marital_Status_and_Hobby() {
	
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='single']")).isSelected());	  
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='dance']")).isSelected());
		//quit(driver);
	}

     @When("^the user check the Country has value$")
     public void the_user_check_the_Country_has_value() {
	    s=new Select(driver.findElement(By.id("dropdown_7")));
	    option=s.getFirstSelectedOption();
	    selectedValue=option.getText();
	    
	}

     @Then("^the user verifies the Country is Afghanistan$")
     public void the_user_verifies_the_Country_is_Afghanistan() {
		Assert.assertEquals("Afghanistan", selectedValue);
		//quit(driver);
	}



}
