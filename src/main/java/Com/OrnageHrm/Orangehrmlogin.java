package Com.OrnageHrm;

import org.openqa.selenium.By;

public class Orangehrmlogin extends BaseClass{
	 public static void login(String username,String password)
	  
	  {  driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.findElement(By.id("txtUsername")).sendKeys(username);
		  driver.findElement(By.id("txtPassword")).sendKeys(password);
		  driver.findElement(By.id("btnLogin")).click();
	  }
	  

}
