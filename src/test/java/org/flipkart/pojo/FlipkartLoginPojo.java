package org.flipkart.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPojo extends Base {
	
	public FlipkartLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement userEmail;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement userPassword;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement login;

	public WebElement getUserEmail() {
		return userEmail;
	}

	public WebElement getUserPassword() {
		return userPassword;
	}

	public WebElement getLogin() {
		return login;
	}

}
