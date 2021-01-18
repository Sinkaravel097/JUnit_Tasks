package org.execution.classes;

import java.io.IOException;
import java.util.Date;

import org.base.Base;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.pojo.objects.BookHotelPojo;
import org.pojo.objects.LoginPojo;
import org.pojo.objects.OrderIdPojo;
import org.pojo.objects.SearchHotelPojo;
import org.pojo.objects.SelectHotelPojo;

public class Question6 extends Base {

	@BeforeClass
	public static void loadBrowser() {
		chrome();
	}

	@AfterClass
	public static void quitBrowser() {
		quitBrowser();
	}
	
	@After
	public void endTime() {
		Date date = new Date();
		System.out.println("Ending : "+date);
	}

	@Before
	public void startTime() {
		Date date = new Date();
		System.out.println("Starting : "+date);
	}

	@Test
	public void tc1() throws IOException {

		launchUrl("http://adactinhotelapp.com/"); // Link

		maxWindow(); // maximize window

		LoginPojo lP = new LoginPojo();

		findEle(lP.getUserNameUsingId(), readExcel(2, 0)); // user name

		findEle(lP.getPasswordUsingId(), readExcel(2, 1)); // password

		clickAny(lP.getLoginBtnUsingId()); // login button

		SearchHotelPojo shp = new SearchHotelPojo();

		selectByVisibleTextUsingId(shp.getLocationUsingid(), readExcel(2, 2)); // location

		selectByVisibleTextUsingId(shp.getHotelUsingId(), readExcel(2, 3)); // hotels

		selectByVisibleTextUsingId(shp.getRoomTypeUsingId(), readExcel(2, 4)); // room type

		selectByVisibleTextUsingId(shp.getNoOfRoomsUsingId(), readExcel(2, 5)); // no of rooms

		findEle(shp.getDateInUsingId(), readExcel(2, 6)); // date in

		findEle(shp.getDateOutUsingId(), readExcel(2, 7)); // date out

		selectByVisibleTextUsingId(shp.getAdultRoomUsingId(), readExcel(2, 8)); // adult room

		selectByVisibleTextUsingId(shp.getChildRoomUsingId(), readExcel(2, 9)); // child room

		clickAny(shp.getSearchBtnUsingId()); // search button

		SelectHotelPojo hp = new SelectHotelPojo();

		clickAny(hp.getRadioBtnUsingId()); // radio button

		clickAny(hp.getContinueBtnUsingId()); // continue button

		BookHotelPojo bhp = new BookHotelPojo();

		findEle(bhp.getFirstNameUsingId(), readExcel(2, 10)); // first name

		findEle(bhp.getLastNameUsingId(), readExcel(2, 11)); // last name

		findEle(bhp.getAddressUsingId(), readExcel(2, 12)); // address

		findEle(bhp.getCaardNumUsingId(), readExcel(2, 13)); // card number

		selectByVisibleTextUsingId(bhp.getCardTypeUsingId(), readExcel(2, 14)); // card type

		selectByVisibleTextUsingId(bhp.getExpMonthUsingId(), readExcel(2, 15)); // expiry month

		selectByVisibleTextUsingId(bhp.getExpYearUsingId(), readExcel(2, 16)); // expiry year

		findEle(bhp.getCvvNumUsingid(), readExcel(2, 17)); // cvv number

		clickAny(bhp.getBookNowBtnUsingId()); // book now button

		OrderIdPojo oi = new OrderIdPojo();

		visibilityOfAllElementsLocatedByUsingId("order_no");
		
		scrollUpAndDown(oi.getOrderIdUsingId());

		String attr = getAttr(oi.getOrderIdUsingId()); // get order number
		System.out.println(attr);
		
		writeDataToParticularCell(2, 18, attr);   // write order number to excel


	}

}
