package Com.agilecrm;

import org.testng.annotations.Test;

import Com.OrnageHrm.BaseClass;
import Com.OrnageHrm.util;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;

public class Addcompany  extends BaseClass{
  
  @BeforeClass
  public void beforeClass()
 {
	launchBrowser("chrome") ;
	driver.get("https://realestateautomation.agilecrm.com/");
	AgileCRMlogin agilecrmlogin=new AgileCRMlogin();
	agilecrmlogin.agilelogin("automation@yopmail.com","Test1234");
	
  }
  @Test
  public void addcompany() {
	  driver.findElement(By.id("companiesmenu")).click();
	  driver.findElement(By.xpath("//button[contains(@class,\"btn btn-default btn\")]")).click();
	  util.waitforElementToBeClick(By.id("company_name"));
	  driver.findElement(By.id("company_name")).sendKeys("TCS");
	  driver.findElement(By.id("company_url")).sendKeys("www.TCS.com");
	  driver.findElement(By.id("company_validate")).click();
	  
	  
	  
  }

}
