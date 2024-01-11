package com.onlineshopping.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.onlineshopping.qa.base.TestBase;

public class AccountPage extends TestBase {

	// inialization of webelements using driver

	public AccountPage() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver, this);

	}

	// Pagefactory or Webelements or Object Repository

	@FindBy(name = "username")
	WebElement userName;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "login")
	WebElement loginBtn;

	@FindBy(css = "div[class='u-column1 col-1'] h2")
	WebElement LoginHeader;

	// Actions

	public String validateLoginHeader() {

		return LoginHeader.getText();

	}

	public DashboardPage Login(String un, String pwd) throws FileNotFoundException {
		userName.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new DashboardPage();
	}

}
