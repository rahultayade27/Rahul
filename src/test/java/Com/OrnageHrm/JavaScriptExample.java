package Com.OrnageHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExample extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("edge");
		
		driver.get("https://realestateautomation.agilecrm.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.name("email")).sendKeys("automation@yopmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Test1234");
		
		WebElement SignInButton=driver.findElement(By.xpath("//input[@value='Sign In']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		
		js.executeScript("arguments[0].click();", SignInButton);
		
		System.out.println(js.executeScript("return document.domain;" ));
		
		System.out.println(js.executeScript("return document.URL;"));
		
		js.executeScript("window.scrollBy(0,100);" );
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		

	}

}
