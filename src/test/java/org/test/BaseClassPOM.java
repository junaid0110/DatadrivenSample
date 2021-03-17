package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassPOM {
	
	//no need Main Method
	
	public static WebDriver driver;
	 
		public void getDriver() {
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		public void launchUrl(String s) {
			driver.get(s);                                 
		}
		
		public void title() {
			driver.getTitle();
		}
		
		public void currentUrl() {
			driver.getCurrentUrl();
		}
		
		//WebElement methods
		public void enterText(WebElement element,String s) {
			element.sendKeys(s);
		}
		
		public void btnClick(WebElement element) {
			element.click();
		}
		
		public void text(WebElement element) {
			element.getText();
		}
		
		public void attribute(WebElement element, String s) {
			element.getAttribute(s);
		}
		
		//Actions Methods
		public void dragAndDrop(WebElement source, WebElement destination) {
			Actions a =new Actions(driver);
			a.dragAndDrop(source, destination).perform();
		}
		
		public void moveto(WebElement target) {
			Actions a = new Actions(driver);
			a.moveToElement(target);
		}
		
		public void rightClick(WebElement right) {
			Actions a = new Actions(driver);
			a.contextClick(right);
		}
		
		public void doubleClick(WebElement d) {
			Actions a = new Actions(driver);
			a.doubleClick(d).perform();
		}
		
		//Alert Methods
		public void simpleAlert() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		public void confirmAlert() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
		public void promptAlert(String s) {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(s);
		}
		
		//TakesScreenShot
		public void screenshot() {
			TakesScreenshot ts = (TakesScreenshot)driver;
			ts.getScreenshotAs(null);
		}
	 
		//DropDown
		public void visibleText(WebElement e, String a) {
			Select s = new Select(e);
			s.selectByVisibleText(a);
		}
		public void visibleText(int a) {
			Select s = new Select((WebElement) driver);
			s.selectByIndex(a);
		}
		public void multipleCheck() {
			Select s = new Select((WebElement) driver);
			s.isMultiple();
		}
		public void options() {
			Select s = new Select((WebElement) driver);
			s.getOptions();
		}
		public void desellect(String a) {
			Select s = new Select((WebElement) driver);
			s.deselectByVisibleText(a);
		}
		public void getFirst(String a) {
			Select s = new Select((WebElement) driver);
			s.getFirstSelectedOption();
		}
		public void getAllSelected() {
			Select s = new Select((WebElement) driver);
			s.getAllSelectedOptions();
		}

		//WindowHandling
		public void getWindowHandle() {
			driver.getWindowHandle();
		}
		public void getWindowHandles() {
			driver.getWindowHandles();
		}
		public void switchWndow(String s) {
			driver.switchTo().window(s);
		}
		
		//JavaScriptExecutor
		public void javaScriptScrollDown(WebElement element) {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);
		}
		public void javaScriptScrollUp(WebElement element) {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false)", element);
		}
		
		public void getAttribute(WebElement element, String value) {
			String attribute = element.getAttribute(value);
			System.out.println(attribute);
		}
		
		
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		