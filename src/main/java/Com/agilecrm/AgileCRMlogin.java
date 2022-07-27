package Com.agilecrm;

import org.openqa.selenium.By;

import Com.OrnageHrm.BaseClass;

public class AgileCRMlogin  extends BaseClass {

	public void agilelogin(String username,String password)
	{
		driver.get("https://realestateautomation.agilecrm.com/");
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value=\"Sign In\"]")).submit();
	}
}
