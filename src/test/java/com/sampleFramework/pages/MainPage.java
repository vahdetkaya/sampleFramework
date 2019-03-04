package com.sampleFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sampleFramework.utilities.Driver;



public class MainPage {

	
	
	public MainPage() {
		PageFactory.initElements(Driver.getDriver(), this);
}
	
	@FindBy (css = "ul.menu>li:nth-child(1)>a")
	public WebElement cardCategory;
	
	
	@FindBy (linkText = "Best Credit Cards")
	public WebElement bestCreditCards;
	
	@FindBy (tagName = "title")
	public WebElement title;
	
	
	
	@FindBy (className = "footerLegal__copyright")
	public WebElement copyright;
}