package Com.agilecrm;

import org.testng.annotations.Test;

import Com.OrnageHrm.BaseClass;
import Com.OrnageHrm.util;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Addcompany  extends BaseClass{
  
  @BeforeClass
  @Parameters({"username","password","browser","url"})
  public void beforeClass(String username,String password,String browser,String url )
 {
	launchBrowser(browser) ;
	driver.get(url);
	AgileCRMlogin agilecrmlogin=new AgileCRMlogin();
	agilecrmlogin.agilelogin(username,password);
	
  }
  @Test
  public void addcompany() {
	  driver.findElement(By.id("companiesmenu")).click();
	  driver.findElement(By.xpath("//button[contains(@class,\"btn btn-default btn\")]")).click();
	  util.waitforElementToBeClick(By.id("company_name"));
	  driver.findElement(By.id("company_name")).sendKeys("TCccsqs");
	  driver.findElement(By.id("company_url")).sendKeys("www.TCS.com");
	  driver.findElement(By.id("company_validate")).click();
	  
	
	
}
    
}
