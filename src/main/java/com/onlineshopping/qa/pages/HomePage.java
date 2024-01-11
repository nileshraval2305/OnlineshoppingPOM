package com.onlineshopping.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onlineshopping.qa.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".wp-block-button__link[href='/store']")
	WebElement shopNowBtn;
	
	public boolean shopnowBtnisDisPlayed()
	{
		
		return shopNowBtn.isDisplayed();
	}
}
