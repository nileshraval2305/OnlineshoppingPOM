package com.onlineshopping.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.FileNotFoundException;

import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onlineshopping.qa.base.TestBase;
import com.onlineshopping.qa.pages.AccountPage;
import com.onlineshopping.qa.pages.DashboardPage;
import com.onlineshopping.qa.pages.HomePage;

public class DashBoardPageTest extends TestBase {

	AccountPage account;
	DashboardPage dashboard;
    HomePage homepage;
	public DashBoardPageTest() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void Setup() throws FileNotFoundException {
		initialization();
		account = new AccountPage();
		homepage = new HomePage();
		dashboard = account.Login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void validateDashboardPageOptions() {
		boolean dashboardlink = dashboard.validateDashboardLink();
		AssertJUnit.assertTrue(dashboardlink);
		boolean orderslink = dashboard.validateOrderLink();
		AssertJUnit.assertTrue(orderslink);
		boolean downloadlink = dashboard.validateDownloadLink();
		AssertJUnit.assertTrue(downloadlink);
		boolean addressLinkOptions = dashboard.validateAddressLinkOptions();
		AssertJUnit.assertTrue(addressLinkOptions);
		boolean accountDetailsOption = dashboard.validateAccountDetailsOption();
		AssertJUnit.assertTrue(accountDetailsOption);

	}
	@Test(priority=2)
	public void validateHomePagelink() throws FileNotFoundException {
		homepage = dashboard.validateHomePagelink();
        boolean shopnowBtn = homepage.shopnowBtnisDisPlayed();
        AssertJUnit.assertTrue(shopnowBtn);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
