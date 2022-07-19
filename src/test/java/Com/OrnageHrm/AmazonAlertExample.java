package Com.OrnageHrm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

public class AmazonAlertExample extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
	
		launchBrowser("chrome");
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
	//	js.executeScript("alert('This is sample alert');");
		
	//	driver.switchTo().alert().accept();
		
	//	js.executeScript("confirm('This is sample alert');");
		
	//	driver.switchTo().alert().dismiss();
		
		js.executeScript("prompt('This is prompt alert');");
		
		Alert alter=driver.switchTo().alert();
		
		System.out.println(alter.getText());
		
		alter.sendKeys("Accepting the alert");
		
		System.out.println(alter.getText());
		
		Thread.sleep(1000);
		
		alter.accept();
		
		
		
		
		

	}

		
	

	
	}


