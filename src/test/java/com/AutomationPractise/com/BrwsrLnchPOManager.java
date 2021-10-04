package com.AutomationPractise.com;

import org.openqa.selenium.WebDriver;

import com.MainPOManager.com.POM;
import com.baseclass.com.BaseClass;
import com.pom.com.FaceBook;
import com.pom.com.LoginPage;

public class BrwsrLnchPOManager extends BaseClass {
	
	// **** Singleton Design Pattern ****
	// 1. Page Object Manager

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = browserLaunch("chrome");
		launchtheUrl(("https://www.facebook.com/"));

		// FaceBook fb=new FaceBook(driver);

		POM p = new POM(driver);
		Thread.sleep(3000);
		
		// inputValues(fb.getEmail(), "ssganapathy96@gmail.com");
		inputValues(p.getinstanceFB().getEmail(), "ssganapathy96@gmail.com");

		// LoginPage lp = new LoginPage(driver);

		// inputValues(lp.getPassword(), "123456");
		inputValues(p.getinstanceLP().getPassword(), "123456");

		// clickOnElement(lp.getLoginbtn());
		clickOnElement(p.getinstanceLP().getLoginbtn());
	}

}
