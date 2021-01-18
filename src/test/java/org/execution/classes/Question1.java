package org.execution.classes;

import java.io.IOException;
import java.util.Date;

import org.base.Base;
import org.facebook.pojo.FbLoginPojo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Question1 extends Base {

	@BeforeClass
	public static void launchBrouser() {

		chrome();

	}

	@AfterClass
	public static void quitBrowser() {

		quitBrowser();

	}

	@Before
	public void startTime() {

		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void endTime() {

		Date d = new Date();
		System.out.println(d);

	}

	@Test
	public void tc1() throws IOException, InterruptedException {

		launchUrl("https://www.facebook.com/");
		maxWindow();
		FbLoginPojo fb = new FbLoginPojo();
		findEle(fb.getUserEmail(), question1(2, 0));
		findEle(fb.getUserPassword(), question1(2, 1));
		clickAny(fb.getLogin());
		Thread.sleep(3000);
	}

	@Test
	public void tc2() throws IOException, InterruptedException {

		launchUrl("https://www.facebook.com/");
		maxWindow();
		FbLoginPojo fb = new FbLoginPojo();
		findEle(fb.getUserEmail(), question1(3, 0));
		findEle(fb.getUserPassword(), question1(3, 1));
		clickAny(fb.getLogin());
		Thread.sleep(3000);
	}
	
	@Test
	public void tc3() throws IOException, InterruptedException {

		launchUrl("https://www.facebook.com/");
		maxWindow();
		FbLoginPojo fb = new FbLoginPojo();
		findEle(fb.getUserEmail(), question1(4, 0));
		findEle(fb.getUserPassword(), question1(4, 1));
		clickAny(fb.getLogin());
		Thread.sleep(3000);
	}

}
