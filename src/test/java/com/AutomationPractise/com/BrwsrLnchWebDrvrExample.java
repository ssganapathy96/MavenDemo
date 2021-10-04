package com.AutomationPractise.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.com.BaseClass;

public class BrwsrLnchWebDrvrExample extends BaseClass {
	
	//**** Browser Launch with Base Class -- WebDriver Methods **** // 

	// --- Normal Using
	// System.setProperty("webdriver.chrome.driver","C:\\Users\\SelvaGanapathy\\eclipse-workspace\\ProjectAutomationPractise\\Driver\\chromedriver.exe");

	// WebDriver Using
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = browserLaunch("Chrome");
		launchtheUrl(("https://www.facebook.com/"));

		WebElement email = driver.findElement(By.id("email"));
		inputValues(email, "9790158027");

		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		inputValues(pass, "ssgTdeva1210@");

		WebElement button = driver.findElement(By.name("login"));
		clickOnElement(button);

		// ClosethePage();
		System.out.println(driver.getCurrentUrl());
	}
}