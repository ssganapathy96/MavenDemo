package com.pom.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook {
	//POM
	
	public static WebDriver driver;
	
	@FindBy(id ="email") //@FindBy---> Before using ---> WebElement email = driver.findElement(By.id("email"));
	private WebElement email;
		
	public FaceBook(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this); // Using ---->Parameterized Constructor
	}
	
	public WebElement getEmail() {
		return email;
	}
}
