package com.onlineshopping.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onlineshopping.qa.base.TestBase;

public class DashboardPage extends TestBase {

	public DashboardPage() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Dashboard']")
	WebElement dashboardLink;
	
	@FindBy(xpath = "//a[text()='Orders']")
	WebElement orders;
	
	@FindBy(xpath = "//a[text()='Downloads']")
	WebElement downloands;
	
	@FindBy(xpath = "//a[text()='Addresses']")
	WebElement addresses;
	
	@FindBy(xpath = "//a[normalize-space()='Account details']")
	WebElement accountDetails;
	
	@FindBy(xpath = "//li[@id='menu-item-1226']//a[@class='menu-link'][normalize-space()='Home']")
	WebElement homePageLink;
	
	public boolean validateDashboardLink()
	{
		return dashboardLink.isDisplayed();
		
	}
	
	public boolean validateOrderLink()
	{
		
		return orders.isDisplayed();
		 
	}
	public boolean validateDownloadLink()
	{
		
		return downloands.isDisplayed();
		
	}
	public boolean validateAddressLinkOptions()
	{
		
		return addresses.isDisplayed();
		
	}
	
	public boolean validateAccountDetailsOption()
	{
		
		return accountDetails.isDisplayed(); 
	}
	public HomePage validateHomePagelink() throws FileNotFoundException
	{
		homePageLink.click();
		return new HomePage();
	}
}

