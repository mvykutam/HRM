package com.hrm.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.Base.TestBase1;
import com.hrm.pages.SignIn_Page;

public class SignIn_Test extends TestBase1 {

	SignIn_Page signin;

	public SignIn_Test() {
		super();
	}

	@BeforeMethod
	
       public void setUp() {
		initialization();
		signin = new SignIn_Page();
	}

	@Test(priority = 1)
	public void VerifyHomeTitle() {
		String homepagetitle = signin.page_title();
		Assert.assertEquals(homepagetitle, "OrangeHRM - New Level of HR Management");
	}

	@Test(priority = 2)
	public void verfiyLogin() {
		signin.loginToApllicaion(prop.getProperty("userName"),prop.getProperty("PassWord"));
		String AfterLogintitle=signin.page_title();
		Assert.assertEquals(AfterLogintitle, "OrangeHRM");
	
	}
	
	@Test(priority=3)
	public void verfiyLogout()
	{
		signin.logout();
		String logouttitle = driver.getTitle();
		Assert.assertEquals(logouttitle,  "OrangeHRM - New Level of HR Management");
	}
	
	
	@AfterMethod
	public void Teardown() {
	 driver.close();
	 driver.quit();

	}

}
