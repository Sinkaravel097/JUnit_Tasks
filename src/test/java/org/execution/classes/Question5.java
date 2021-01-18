package org.execution.classes;

import java.io.IOException;

import org.base.Base;
import org.junit.BeforeClass;
import org.junit.Test;
import org.question5.Question5Pojo;

public class Question5 extends Base{
	
	@BeforeClass
	public static void launchBrowser() {
		chrome();
	}
	
	@Test
	public void tc1() throws IOException {
		launchUrl("https://demoqa.com/automation-practice-form/");
		maxWindow();
		implicitTime();
		Question5Pojo q5 = new Question5Pojo();
		findEle(q5.getFirstname(), question5(1, 0));
		findEle(q5.getLastName(), question5(1, 1));
		findEle(q5.getEmail(), question5(1, 2));
		javaClick(q5.getGender());
		findEle(q5.getNumber(), question5(1, 3));
		javaSendKeys(q5.getSub(), question5(1, 4));
		Object jg = javaGetAttribute(q5.getSub());
		System.out.println("Subject : "+jg);
		scrollUpAndDown(q5.getHobbies());
		javaClick(q5.getHobbies());
		findEle(q5.getAddress(), question5(1, 5));
		clickAny(q5.getSubmit());
		
		String textGet = textGet(q5.getSuccessful());
		if (textGet.contains("Thanks")) {
			System.out.println("Valid Inputs");
		}

	}

}
