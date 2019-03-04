package com.sampleFramework.step_definitions;



import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.sampleFramework.pages.MainPage;
import com.sampleFramework.utilities.ConfigurationReader;
import com.sampleFramework.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MainPageStepDefs {

	MainPage mainPage = new MainPage();

@Given("the user is on the main page")
public void the_user_is_on_the_main_page() {
	String url = ConfigurationReader.getProperty("url");
	Driver.getDriver().get(url);
	Driver.getDriver().manage().window().maximize();
	
}

@When("the user hover over the card Category")
public void the_user_hover_over_the_card_Category() {
	
	Actions builder = new Actions(Driver.getDriver());
    Action mouseOverHome = builder
            .moveToElement(mainPage.cardCategory)
            .build();
    mouseOverHome.perform();
  
}
@Then("the user should be able to see pulldown menu")
public void the_user_should_be_able_to_see_pulldown_menu() {
	
	
	
	assertTrue(mainPage.bestCreditCards.isDisplayed());
	
    
}

@Then("the user should be able click Best Credit cards link")
public void the_user_should_see_Best_Credit_cards_link() {
	//fail();
	mainPage.bestCreditCards.click();
	
	
}

@Then("Title should be equal to Credit Cards - Compare Credit Card Offers at CreditCards.com")
public void title_should_be_equal_to_Credit_Cards_Compare_Credit_Card_Offers_at_CreditCards_com() {
 

	assertEquals("title of the page is not equal to expected value", "Credit Cards - Compare Credit Card Offers at CreditCards.com", Driver.getDriver().getTitle());
	
	
}

@Then("url should be equal to https:\\/\\/www.creditcards.com\\/")
public void url_should_be_equal_to_https_www_creditcards_com() {
	assertEquals("you are in different url", "https://www.creditcards.com/", Driver.getDriver().getCurrentUrl());
	Driver.getDriver().close();
}	
	
}
