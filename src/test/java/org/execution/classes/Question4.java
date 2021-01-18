package org.execution.classes;

import java.io.IOException;
import java.util.Date;

import org.base.Base;
import org.flipkart.pojo.FlipkartLoginPojo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Question4 extends Base{
	
	@BeforeClass
	public static void loadBrowser() {

		chrome();
	}
	
	@AfterClass
	public static void quitBrowser() {
		
		quitBrowser();
	}
	
	@Before
	public void startTime() {
		
		Date date = new Date();
		System.out.println(date);

	}
	
	@After
	public void endTime() {
		
		Date date = new Date();
		System.out.println(date);
	}
	
	@Test
	public void tc1() throws IOException, InterruptedException {
		
		launchUrl("https://www.flipkart.com/account/login");
		maxWindow();
		FlipkartLoginPojo flp = new FlipkartLoginPojo();
		findEle(flp.getUserEmail(), readExcel(2, 0));
		findEle(flp.getUserPassword(), readExcel(2, 1));
		clickAny(flp.getLogin());
		Thread.sleep(3000);
	}
	
	@Ignore
	@Test
	public void tc2() throws IOException, InterruptedException {
		
		launchUrl("https://www.flipkart.com/account/login");
		maxWindow();
		FlipkartLoginPojo flp = new FlipkartLoginPojo();
		findEle(flp.getUserEmail(), readExcel(3, 0));
		findEle(flp.getUserPassword(), readExcel(3, 1));
		clickAny(flp.getLogin());
		Thread.sleep(3000);
	}
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		
		launchUrl("https://www.flipkart.com/account/login");
		maxWindow();
		FlipkartLoginPojo flp = new FlipkartLoginPojo();
		findEle(flp.getUserEmail(), readExcel(4, 0));
		findEle(flp.getUserPassword(), readExcel(4, 1));
		clickAny(flp.getLogin());
		Thread.sleep(3000);
	}

}
