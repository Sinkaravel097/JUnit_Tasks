package org.execution.classes;

import org.base.Base;
import org.junit.BeforeClass;
import org.junit.Test;
import org.question3.Question3Pojo;

public class Question3 extends Base {
	
	
	@BeforeClass
	public static void launchBrowser() {
		chrome();
	}
	
	
	@Test
	public void tc1() {
		launchUrl("https://demoqa.com/automation-practice-form/");
		maxWindow();
		implicitTime();
		Question3Pojo q3 = new Question3Pojo();
		findEle(q3.getFirstname(), "Vishal");
		findEle(q3.getLastName(), "S");
		findEle(q3.getEmail(), "vishal@gmail.com");
		javaClick(q3.getGender());
		findEle(q3.getNumber(), "9092737724");
		javaSendKeys(q3.getSub(), "12345678");
		Object jg = javaGetAttribute(q3.getSub());
		System.out.println("Subject : "+jg);
		scrollUpAndDown(q3.getHobbies());
		javaClick(q3.getHobbies());
		findEle(q3.getAddress(), "I Dont Know Address");
		clickAny(q3.getSubmit());
		
		String textGet = textGet(q3.getSuccessful());

		if (textGet.contains("Thanks for submitting the form")) {
			System.out.println("Valid Inputs");
		}

	
	}



}
