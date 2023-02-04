package com.Neostox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Neostox.Base.BasePage;

public class FeedbackPage extends BasePage{
	
	WebDriver driver;
	
	public FeedbackPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='feedbackdropdown']")
	public WebElement buttonFeedback;
	
	@FindBy(xpath="//span[text()='Write Feedback']")
	public WebElement labelwritefeedback;
	
	@FindBy(id="txt_feedback_useremail")
	public WebElement textfeedbackuseremail;
	
	
}
