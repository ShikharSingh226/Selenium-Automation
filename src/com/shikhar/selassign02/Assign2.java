package com.shikhar.selassign02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shikhar\\Desktop\\seleniumtrain\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		// Exception Handling
		/*
		 * driver.get("https://www.google.com/"); try{
		 * driver.findElement(By.name("True")).click(); } catch (Exception e) {
		 * System.out.println("Element is not found."); throw(e); }
		 */
		// Implicit wait
		/*
		 * driver.navigate().to("http://www.seleniumframework.com/practiceform/");
		 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); WebElement
		 * elementid=driver.findElement(By.id("button1")); elementid.click();
		 */
		// Explicit wait
		/*
		 * driver.navigate().to("https://www.facebook.com/");
		 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); WebElement
		 * email=driver.findElement(By.id("email")); WebElement
		 * pass=driver.findElement(By.id("pass"));
		 * sendKeys(driver,email,10,"shikhar321");
		 * sendKeys(driver,pass,10,"shikhar321");
		 */
	}
	/*
	 * public static void sendKeys(WebDriver driver1,WebElement element, int
	 * timeout, String value) { new WebDriverWait(driver1,
	 * timeout).until(ExpectedConditions.visibilityOf(element));
	 * element.sendKeys(value); }
	 */

}
