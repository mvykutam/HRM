package com.hrm.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.tokens.AliasToken;

import com.hrm.Base.TestBase1;
import com.hrm.pages.EmployeeInformation_Page;
import com.hrm.pages.SignIn_Page;

public class EmployeeInformationTest extends TestBase1 {

	public EmployeeInformation_Page ei;

	public SignIn_Page signin;

	public EmployeeInformationTest()

	{
		super();
	}

	@Test(priority = 1)
	public void setup() throws InterruptedException {
		initialization();
		signin = new SignIn_Page();
		signin.loginToApllicaion(prop.getProperty("userName"), prop.getProperty("PassWord"));
		}

	@Test(priority = 2)
	public void verifyAddEmployee() throws Exception {
		//ei.a();
		ei=new EmployeeInformation_Page();
		ei.AddEmployeeOption("joe", "kevin");
		Assert.assertEquals(true, ei.pesrsonalDetailsSection1());
		Reporter.log("navigated to personal details page");
		
		//Assert.assertEquals(ei.pesrsonalDetailsSection(), "Personal Details");
		// Assert.assertEquals(pesrsonalDetailsSection(.get).expected);, expected);
		// Assert.assertEquals(true, homepage.getRegistrationSuccess());

	}

	// @Test(priority=2)
	// public void VerifyInvalidaddEmployee()
	// {
	// ei.AddEmployeeEmpty("joe", "matt");
	//
	//
	//
	//
	// }

}
