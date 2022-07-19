package Com.OrnageHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class LoginTestCase extends BaseClass {

	public static void main(String[] args) {
		LoginTestCase obj=new LoginTestCase();
		obj.launchBrowser("chrome");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		WebElement restUserName = null;
		
		try {
			driver.findElement(By.partialLinkText("forgot your")).click();
			restUserName = driver.findElement(By.id("securityAuthenticatio_userName"));
			restUserName.sendKeys("test@test.com");
			driver.findElement(By.id("btnSearchValues")).click();
			restUserName.click();
			
			//restUserName.clear();
		} catch (StaleElementReferenceException | ElementNotVisibleException e) {
			driver.navigate().refresh();
		}
	}
}
			
			
		
	
	
		
		



