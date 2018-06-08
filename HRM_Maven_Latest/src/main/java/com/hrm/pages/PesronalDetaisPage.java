package com.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.Base.TestBase1;

public class PesronalDetaisPage extends TestBase1{ 
	
	@FindBy(xpath="//h2[contains(text(),'Personal Details')]")
	WebElement Personaldetailspage;
	
    @FindBy(xpath="//input[@id=\"txtEmployeeId\"]")
    WebElement Code;
    
    @FindBy(xpath="//input[@id=\"txtEmpLastName\" and @name=\"txtEmpLastName\"]")
    WebElement LastName;
    
    @FindBy(xpath="//input[@id=\"txtEmpFirstName\" and @name=\"txtEmpFirstName\"]")
    WebElement FirstName;
    
    @FindBy(xpath="//input[@id=\"txtEmpMiddleName\" and @name=\"txtEmpMiddleName\"]")
    WebElement MiddleName;
    
    @FindBy(xpath="//input[@id=\"txtEmpNickName\" and @name=\"txtEmpNickName\"]")
    WebElement NickName;
    
    @FindBy(xpath="//input[@id=\"txtNICNo\" and @name=\"txtNICNo\"]")
    WebElement SSN_No;
    
    @FindBy(xpath="//select[@id=\"cmbNation\" and @name=\"cmbNation\"]")
    WebElement Nationality_DD;
    
   @FindBy(xpath="//input[@id=\"DOB\" and @name=\"DOB\"]")
    WebElement DOB_calanderPicker;
   
   @FindBy(xpath="//input[@id=\"txtOtherID\" and @name=\"txtOtherID\"]")
   WebElement OtherID;
   
   @FindBy(xpath="//select[@id=\"cmbMarital\" and @name=\"cmbMarital\"]")
   WebElement MaritalStatus_DD;
   
   @FindBy(xpath="//input[@id=\"chkSmokeFlag\" and @name=\"chkSmokeFlag\"]")
   WebElement Smoker;
   
   @FindBy(xpath="//input[@id=\"gender1\" and @name=\"optGender\"]")
   WebElement MaleGender_radiobutton;
   
   @FindBy(xpath="//input[@id=\"gender2\" and @name=\"optGender\"]")
   WebElement FemaleGender_radiobutton;
   
   @FindBy(xpath="//input[@id=\"txtLicenNo\" and @name=\"txtLicenNo\"]")
   WebElement DriversLicense_no;
   
   @FindBy(xpath="//input[@id=\"txtLicExpDate\" and @name=\"txtLicExpDate\"]")
   WebElement DriversLicenseExpiry_CalenderPicker;
   
   @FindBy(xpath="//input[@id=\"txtMilitarySer\" and @name=\"txtMilitarySer\"]")
   WebElement MilitaryService;
   
   @FindBy(xpath="//select[@id=\"cmbEthnicRace\" and @name=\"cmbEthnicRace\"]")
   WebElement EthnicRace_DD;
   
   @FindBy(xpath="//input[@id=\"btnEditPers\" and @name=\"EditMain\"]")
   WebElement Save_button;
   
   
   public void  PesronalDetaisPage()
   {
	   PageFactory.initElements(driver, this);
   }
   
   
    
    
    
    
    
    
	
	
	

}
