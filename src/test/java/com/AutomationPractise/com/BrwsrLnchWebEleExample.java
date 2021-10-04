package com.AutomationPractise.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.com.BaseClass;

public class BrwsrLnchWebEleExample extends BaseClass {
	
	//**** Browser Launch with Base Class -- WebElements Methods **** // 

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SelvaGanapathy\\eclipse-workspace\\ProjectAutomationPractise\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement findElement = driver.findElement(By.id("email"));
		// findElement.sendKeys("9790158027"); ----> Normal using
		inputValues(findElement, "9790158027"); // ------ BaseClass extends & inputvalues using

		WebElement findElement1 = driver.findElement(By.xpath("//input[@id='pass']"));
		// findElement1.sendKeys("ssgTdeva1210@");----> Normal using
		inputValues(findElement1, "ssgTdeva1210@");

		Thread.sleep(3000);

		WebElement findElement2 = driver.findElement(By.name("login"));
		// findElement2.click(); ----> Normal using
		clickOnElement(findElement2);

		// driver.close();

	}
}
