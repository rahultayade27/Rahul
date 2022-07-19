package Com.OrnageHrm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

public class AlertExample extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("Chrome");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//js.executeScript("alert('This is Sample alert');");
		
	//	driver.switchTo().alert().accept();
		
	//	js.executeScript("confirm('This is Sample alert');");
		
	//	driver.switchTo().alert().dismiss();
		
		js.executeScript("prompt('This is prompt alert');");
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.sendKeys("Accepting the alert");
		
		
		
		

	}

}
