package com.shikhar.selassign01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgin1 {
	 public static void main(String[] args) throws InterruptedException {  
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Shikhar\\Desktop\\seleniumtrain\\chromedriver_win32\\chromedriver.exe");  
     WebDriver driver=new ChromeDriver();  
     driver.manage().window().maximize(); 
     
     //driver.navigate().to("http://www.seleniumframework.com/practiceform/");  
     //Thread.sleep(3000);
     
     //Element By id 
     //WebElement elementid=driver.findElement(By.id("button1"));
     //elementid.click();
     //Thread.sleep(3000);
     
     //Navigateing to other website
     //driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");  
     
     //Elements by classname
     // driver.findElement(By.className("Automation")).click();  
     // Thread.sleep(3000);
     
     //Element By TagName
     //driver.findElement(By.tagName("input")).sendKeys("Selenium");  
     //Thread.sleep(3000);
     
     //Element By Link Text
     //driver.findElement(By.linkText("This is a link")).click();  
     //Thread.sleep(3000);
     
     //Element By Partial Link Text
     //driver.findElement(By.partialLinkText("This is ")).click();  
     //Thread.sleep(3000);
     
     //Elements by xPath
     //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shikharsigh123@gmail.com");  
     //Thread.sleep(3000);
     
     //Elements by xpath contains function
     //driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("shikharsigh123@gmail.com");  
     //Thread.sleep(3000);
     
     //Elements by xpath starts-wiyh function
     //driver.findElement(By.xpath("//input[starts-with(@name,'ema')]")).sendKeys("shikharsigh123@gmail.com");  
     //Thread.sleep(3000);
     
     //Elements by CSS Selector using id
     //driver.navigate().to("https://www.ebay.com/");
     //driver.findElement(By.cssSelector("#gh-ac")).sendKeys("samsung"); 
     //Thread.sleep(3000);
     
     ////Elements by CSS Selector using classname
     //driver.navigate().to("https://www.ebay.com/");
     //driver.findElement(By.cssSelector(".gh-p")).click(); 
     //Thread.sleep(3000);
     
     //Elements by Iframe
     //driver.navigate().to("https://www.rediff.com/");
     //driver.switchTo().frame("moneyiframe");
     //driver.findElement(By.id("nseindex")).click(); 
     //Thread.sleep(3000);
      
     
}
}
