package org.execution.classes;

import org.base.Base;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.question2.Question2Pojo;


public class Question2 extends Base{
	
	
	@BeforeClass
	public static void launchBrowser() {
		firefox();
	}
	
	
	@Test
	public void tc1() throws InterruptedException {
		
		launchUrl("https://www.redbus.in/");
		
		maxWindow();
		
		implicitTime();
		
		Question2Pojo q2 = new Question2Pojo();
		
		clickAny(q2.getAccount());
		
		clickAny(q2.getSignIn());
		
		switchToFrameUsingElement(q2.getFrame());
		
		findEle(q2.getMobileTxtField(), "9092737724");
		
	}


}
