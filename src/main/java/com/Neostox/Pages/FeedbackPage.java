package com.Neostox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Neostox.Base.BasePage;

public class FeedbackPage extends BasePage{
	
	WebDriver driver;
	
	public FeedbackPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
