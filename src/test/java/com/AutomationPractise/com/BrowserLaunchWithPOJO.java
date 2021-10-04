package com.AutomationPractise.com;

import org.openqa.selenium.WebDriver;

import com.baseclass.com.BaseClass;
import com.pom.com.FaceBook;
import com.pom.com.LoginPage;

public class BrowserLaunchWithPOJO extends BaseClass{
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = browserLaunch("chrome");
		launchtheUrl(("https://www.facebook.com/"));
		
		FaceBook fb=new FaceBook(driver);
		Thread.sleep(3000);
		
		inputValues(fb.getEmail(), "ssganapathy96@gmail.com");
		
		
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(3000);
		
		inputValues(lp.getPassword(), "123456");
		
		clickOnElement(lp.getLoginbtn());
	}
}
