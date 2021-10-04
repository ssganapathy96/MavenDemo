package com.MainPOManager.com;

import org.openqa.selenium.WebDriver;

import com.pom.com.FaceBook;
import com.pom.com.LoginPage;

// Page Object Manager
public class POM {

	public static WebDriver driver;

	private FaceBook fb;

	private LoginPage lp;
	
	

	public POM(WebDriver driver2) {
		this.driver = driver2;
	}

	public FaceBook getinstanceFB() {
		fb = new FaceBook(driver);
		return fb;

	}

	public LoginPage getinstanceLP() {
		lp = new LoginPage(driver);
		return lp;

	}

}
