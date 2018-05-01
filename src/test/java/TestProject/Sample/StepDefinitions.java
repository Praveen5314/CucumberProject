package TestProject.Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitions extends BaseClass {

	@Given("^the user in demoqa website$")
	public void the_user_in_demoqa_website()  {
		WebDriver driver=getDriver("http://demoqa.com/registration/");
	}

	@When("^the user enters fname and lname$")
	public void the_user_enters_fname_and_lname()  {
	    driver.findElement(By.id("name_3_firstname")).sendKeys("Praveen");
	    driver.findElement(By.id("name_3_lastname")).sendKeys("kumar");
	    
	}

	@Then("^the user verifies the entered text in fname and lname$")
	public void the_user_verifies_the_entered_text_in_fname_and_lname() 
	{
		Assert.assertEquals("Praveen", driver.findElement(By.id("name_3_firstname")).getAttribute("value"));
		Assert.assertEquals("kumar", driver.findElement(By.id("name_3_lastname")).getAttribute("value"));
	   
	}
	@When("^the user choose marital status and hobby$")
	public void the_user_choose_marital_status_and_hobby()  {
	    driver.findElement(By.xpath("//input[@value='single']")).click();
	    driver.findElement(By.xpath("//input[@value='dance']")).click();
	}

	@Then("^the user verifies the marital status and hobby selected$")
	public void the_user_verifies_the_marital_status_and_hobby_selected() {
		/*List<WebElement>  oRadioButton = driver.findElements(By.className("input_fields  radio_fields"));
		 boolean bValue = false;
		 bValue = oRadioButton.get(0).isSelected();
		 if(bValue = true){
			oRadioButton.get(0).click();

		 }else{
			oRadioButton.get(1).click();

		 }*/
		 List<WebElement> oCheckBox = driver.findElements(By.name("radio_4[]"));
		 
		 int iSize = oCheckBox.size();
		 		 
		 for(int i=0; i < iSize ; i++ ){
		 		 
			 String sValue = oCheckBox.get(i).getAttribute("value");
				 
			 if (sValue.equalsIgnoreCase("single")){
		 
				 oCheckBox.get(i).click();
		 
				 break;
		 
				 }
		 
			}
		//Assert.assertEquals("single", driver.findElement(By.xpath("//input[@value='single']")).getAttribute("value"));
		//Assert.assertEquals("single", driver.findElement(By.xpath("//input[@value='dance']")).getAttribute("value"));
	  
	}

	@When("^the user check the country has value$")
	public void the_user_check_the_country_has_value() {
		Select s=new Select(driver.findElement(By.id("dropdown_7")));
		WebElement option=s.getFirstSelectedOption();
		String selectedValue=option.getText();
	    
	}

	@Then("^the user verifies the country is Afghanistan$")
	public void the_user_verifies_the_country_is_Afghanistan() {
		Select s=new Select(driver.findElement(By.id("dropdown_7")));
		WebElement option=s.getFirstSelectedOption();
		String selectedValue=option.getText();
		System.out.println(selectedValue);
	}



}
