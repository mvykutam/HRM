package com.hrm.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.Base.TestBase1;

public class EmployeeInformation_Page extends TestBase1 {

	@FindBy(xpath = "//*[@id=\"option-menu\"]/li[1]")
	WebElement welcomeuserName;

	@FindBy(xpath = "//a[contains(text(),'Change Password')]")
	WebElement ChangePassword;
 

	@FindBy(xpath = "//span[contains(text(),'PIM')]")
	WebElement PIM;

	@FindBy(xpath = "//span[contains(text(),'Add Employee')]")
	WebElement AddEmployee;

	@FindBy(xpath = "//h2[contains(text(),'PIM : Add Employee')]")
	WebElement PIMAddEmployee;

	@FindBy(xpath = "//input[@name='txtEmpLastName']")
	WebElement EmpLastname;

	@FindBy(xpath = "//input[@name='txtEmpFirstName']")
	WebElement EmpFirstname;

	@FindBy(xpath = "//input[@id='btnEdit']")
	WebElement SaveButton;
	
	@FindBy(xpath="//h2[contains(text() ,'Personal Details')]")
	WebElement PersonalDetails;

	
	public EmployeeInformation_Page  ()
	{
		PageFactory.initElements(driver, this);
	}
	
/*//	public void selectPim()
////	{
////		switchFrame("rightMenu");
////		StartAction();
////		mouseOver(PIM);
////		waitForElement(driver, 30, PIM);
////		AddEmployee.click();
////	}
////	
//	
*/	/*public void AddEmployeeEmpty(String FirstName, String LastName) throws InterruptedException
	{
		driver.switchTo().frame("rightMenu");
		Thread.sleep(2000);
		StartAction();
		mouseOver(PIM);
		waitForElement(driver, 30, PIM);
		AddEmployee.click();
	
		gettext(PIMAddEmployee, "PIM : Add Employee");
		//assertEquals(PIMAddEmployee.getText(), "PIM : Add Employee");
		EmpLastname.isDisplayed();
		EmpLastname.clear();
		EmpFirstname.isDisplayed();
		EmpFirstname.clear();
		SaveButton.click();
		alerts();
		alertAccept();
		EmpLastname.sendKeys(LastName);
		SaveButton.click();
		alerts();
		alertAccept();
		EmpFirstname.sendKeys(FirstName);
		SaveButton.click();
		
		
	}*/

	public void a() throws Exception
	{
		
	}
	
	public void AddEmployeeOption(String FirstName, String LastName) throws Exception {
		
//		Actions act =new Actions(driver);
//		act.moveToElement(PIM).perform();
		Thread.sleep(3000);		
		StartAction();
		mouseOver(PIM);
		waitForElement(driver, 30, PIM);
	    AddEmployee.click();
	    Thread.sleep(3000);	
		switchFrame("rightMenu");
		//gettext(PIMAddEmployee, "PIM : Add Employee");
		//assertEquals(PIMAddEmployee.getText(), "PIM : Add Employee");
		
		EmpLastname.isDisplayed();
		EmpLastname.clear();
		EmpLastname.sendKeys(LastName);
		EmpFirstname.isDisplayed();
		EmpFirstname.clear();
		EmpFirstname.sendKeys(FirstName);
		SaveButton.click();
		Thread.sleep(3000);	
	}

		
		public boolean pesrsonalDetailsSection1()
		{
			return  PersonalDetails.isDisplayed();
		}
		
		
		public String pesrsonalDetailsSection()
		{
			return   PersonalDetails.getText();
		}
		
	}


