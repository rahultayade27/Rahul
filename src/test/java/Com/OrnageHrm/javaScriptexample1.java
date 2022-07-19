package Com.OrnageHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class javaScriptexample1 extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("chrome");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		WebElement LoginButton=driver.findElement(By.xpath("//input[@name='Submit']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();",LoginButton );
		
	    System.out.println(js.executeScript("return document.domain;"));
	
		System.out.println(js.executeScript("return document.URL;"));
		
		js.executeScript("window.scrollBy(0,1000);");
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

	}

}
