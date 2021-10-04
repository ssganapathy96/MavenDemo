package com.AutomationPractise.com;

import org.openqa.selenium.WebDriver;

import com.HelperReader.com.FileReaderManager;
import com.MainPOManager.com.POM;
import com.baseclass.com.BaseClass;
import com.pom.com.FaceBook;
import com.pom.com.LoginPage;

public class BrwsrLnchHelprRdr extends BaseClass {
	
	// **** Singleton Design Pattern ****
		// 2. File Reader Manager
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		
		//driver = browserLaunch("chrome");
		
		driver = browserLaunch(FileReaderManager.getInstanceFR().getInstanceCR().getBrowser());
		
		// launchtheUrl(("https://www.facebook.com/"));
		
		launchtheUrl(FileReaderManager.getInstanceFR().getInstanceCR().getUrl());
	
		POM p = new POM(driver);
		
		Thread.sleep(3000);
		
		//inputValues(p.getinstanceFB().getEmail(), "ssganapathy96@gmail.com");
		
		inputValues(p.getinstanceFB().getEmail(), FileReaderManager.getInstanceFR().getInstanceCR().getUsername());
		
		//inputValues(p.getinstanceLP().getPassword(), "123456");
		
		inputValues(p.getinstanceLP().getPassword(), FileReaderManager.getInstanceFR().getInstanceCR().getPassword());
		
		//clickOnElement(p.getinstanceLP().getLoginbtn());
		
		clickOnElement(p.getinstanceLP().getLoginbtn());
	}

	}


