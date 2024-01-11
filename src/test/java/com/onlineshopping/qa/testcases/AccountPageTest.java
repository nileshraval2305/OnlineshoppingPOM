package com.onlineshopping.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onlineshopping.qa.base.TestBase;
import com.onlineshopping.qa.pages.AccountPage;

public class AccountPageTest extends TestBase{

	AccountPage account;
	
	
	public AccountPageTest() throws FileNotFoundException {
		super();
		
	}

	@BeforeMethod
	public void Setup() throws FileNotFoundException
	{
		initialization();
		account = new AccountPage();
	}
	
	@Test
	public void ValidateHeader()
	{
		String loginHearder = account.validateLoginHeader();
		AssertJUnit.assertEquals(loginHearder, "Login");
	}
	
	@Test
	public void Login() throws FileNotFoundException
	{
		account.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void Teardown()
	{
		driver.close();
	}
	

}

