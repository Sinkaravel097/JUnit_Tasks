package org.pojo.objects;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPojo extends Base {

	// public constructor
	
	public BookHotelPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	// Book Hotel Page Locators
	
	@FindBy(id="first_name")
	private WebElement firstNameUsingId;
	
	@FindBy(id="last_name")
	private WebElement lastNameUsingId;
	
	@FindBy(id="address")
	private WebElement addressUsingId;
	
	@FindBy(id="cc_num")
	private WebElement caardNumUsingId;
	
	@FindBy(id="cc_type")
	private WebElement cardTypeUsingId;
	
	@FindBy(id="cc_exp_month")
	private WebElement expMonthUsingId;
	
	@FindBy(id="cc_exp_year")
	private WebElement expYearUsingId;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNumUsingid;
	
	@FindBy(id="book_now")
	private WebElement bookNowBtnUsingId;
	
	
	// Get Locators using Getters

	public WebElement getBookNowBtnUsingId() {
		return bookNowBtnUsingId;
	}

	public WebElement getCardTypeUsingId() {
		return cardTypeUsingId;
	}

	public WebElement getExpMonthUsingId() {
		return expMonthUsingId;
	}

	public WebElement getExpYearUsingId() {
		return expYearUsingId;
	}

	public WebElement getCvvNumUsingid() {
		return cvvNumUsingid;
	}

	public WebElement getFirstNameUsingId() {
		return firstNameUsingId;
	}

	public WebElement getLastNameUsingId() {
		return lastNameUsingId;
	}

	public WebElement getAddressUsingId() {
		return addressUsingId;
	}

	public WebElement getCaardNumUsingId() {
		return caardNumUsingId;
	}

}
