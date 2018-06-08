package com.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.Base.TestBase1;


public class SignIn_Page extends TestBase1 {
	
	
		@FindBy(xpath="//input[contains(@name,'txtUserName')]")
		WebElement UserName;
		
		@FindBy(xpath="//input[contains(@type,'password')]")
		WebElement Password;
		
		@FindBy(xpath="//input[contains(@type,'Submit')]")
		WebElement submitButton;
		
		@FindBy(xpath="//a[contains(text(),'Logout')]")
		WebElement Logout;
		
		
		
		public SignIn_Page()
		{
			PageFactory.initElements(driver, this);
		}
		
		public String page_title()
		{
			return driver.getTitle();
		}
		
		
		
		public void loginToApllicaion(String userName,String password)
		{
			UserName.isDisplayed();
			UserName.clear();
			UserName.sendKeys(userName);
			Password.isDisplayed();
			Password.clear();
			Password.sendKeys(password);
			submitButton.click();
		}
						
		public void logout()
		{
			Logout.click();
		}

		
}
