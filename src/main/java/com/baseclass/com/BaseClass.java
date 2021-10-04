package com.baseclass.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	// **********WebElements Methods*********

	// 1. SendKeys
	public static void inputValues(WebElement element, String str) { // SendKeys in-future using = "inputValues"
		element.sendKeys(str); 										// SendKeys is a one of the WebElement
																	// String using in SendKeys
	}

	// 2. Click
	public static void clickOnElement(WebElement element) {// Click in-future using = "clickOnElement"
		element.click();
	}

	// 3. Clear
	public static void clearTheText(WebElement element) {
		element.clear();
	}

	// 4. Get Text
	public static void getText(WebElement gt) {
		String text = gt.getText();
		System.out.println(text);
	}


	// **********WebDriver Methods*********

	public static WebDriver driver; // ----> null driver

	// 1. Browser Launch
	public static WebDriver browserLaunch(String Browser) {

		// In-future "WebDriver driver = new ChromeDriver();" ---> "driver =
		// browserLaunch("Chrome");"

		if (Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SelvaGanapathy\\eclipse-workspace\\ProjectAutomationPractise\\Driver2\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (Browser.equalsIgnoreCase("FireFox")) { // --- equalsIgnoreCase --> Any Case accept(Upper / Lower)
			System.setProperty("webdriver.gecko.driver", "Path");
			driver = new FirefoxDriver();

		}

		else {
			System.out.println("Launch failed, Check thde browser name");
		}

		driver.manage().window().maximize();
		return driver;

	}

	// 2. Close
	public static void ClosethePage() {
		driver.close();
	}

	// 3. Quit
	public static void quittheBrowser() {
		driver.quit();
	}

	// Navigate to
	public static void navigateTo(String linkname) {
		driver.navigate().to(linkname);
	}

	// Navigate back
	public static void navigateBack() {
		driver.navigate().back();
	}

	// Navigate forward
	public static void navigateFrwrd() {
		driver.navigate().forward();
	}

	// Navigate refresh
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	// Get
	public static void launchtheUrl(String url) {
		driver.get(url);
	}

	// Get Title
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// Get Current Url
	public static void getCurrentUrl(String Currenturl) {
		String Curl = driver.getCurrentUrl();
		System.out.println(Curl);
	}

	// Drop Down
	public static void dropDownSelection(WebElement element, String option, String input) {
		Select s = new Select(element);
		if (option.equals("index")) {
			int parsInt = Integer.parseInt(input);
			s.selectByIndex(parsInt);

		} else if (option.equals("values")) {
			s.selectByValue(input);

		} else if (option.equals("text")) {
			s.selectByVisibleText(input);

		}
	}

	// Get Attribute
	public static void getAttribute(By bysearchButton) {
		WebElement element = driver.findElement(bysearchButton);
		System.out.println(element);
	}

	// Is Enabled
	public static void isEnabled(WebElement element) {
		element.isEnabled();
	}

	// Is Displayed
	public static void isDisplayed(WebElement element) {
		element.isDisplayed();
	}

	// Is Selected
	public static void isSelected(WebElement element) {
		element.isSelected();
	}

	// Simple Alert
	public static void simplealert() {
		Alert Simplealert = driver.switchTo().alert();
		Simplealert.accept();
	}

	// Confirm Alert
	public static void confirmalert() {
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.accept();
	}

	// Prompt Alert
	public static void promptalert() {
		Alert promptalert = driver.switchTo().alert();
		promptalert.accept();
	}

	// Drag And Drop
	public static void dragdrop(WebElement drag, WebElement drop) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).build().perform();

	}

	// Move To Element
	public static void action(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	// Frames
	public static void frames(WebElement ifram) {
		// iframe.click();
		driver.switchTo().frame(0);

	}

	// Take ScreenShot
	public static void takesScreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File(path);
		FileUtils.copyFile(srcfile, destfile);
	}

	// Implicit Wait
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	// Explicit Wait
	public static void explicitwait(long seconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	// Fluent Wait
	public static void fluentwait() {
		FluentWait wait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS);
	}

	// Window handles
	public static void windowshandling() {
		driver.getWindowHandles();

	}

	// Robot
	public static void robot(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	// Select
	public static void getSelected() {
		Select select = new Select(driver.findElement(By.xpath("//select")));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

	}

	// Scroll Up & Down
	public static void scrollupdown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.screen");

	}
}