package Com.OrnageHrm;

import java.util.Set;

import org.openqa.selenium.By;

public class WindowsHandling extends BaseClass {

	public static void main(String[] args) {
	launchBrowser("chrome");
	driver.get("https://www.redbus.in/");
	driver.findElement(By.linkText("Help")).click();
	//Get parent windowsId
	String ParentTabId=driver.getWindowHandle();
	//print parent windowsTab id
	System.out.println(ParentTabId);
	//get All WindowsTab Id
	Set<String> WindowIds=driver.getWindowHandles();
	//print all windows ID
	System.out.println(WindowIds);
	//iterate set of window id and switch to child window
	for(String Id:WindowIds)
	{ if(!Id.equals(ParentTabId));
	 System.out.println(Id);
	 //switch to child window
	 driver.switchTo().window(Id);
	 //print the title of child window
	 System.out.println(driver.getTitle());
	// driver.close();
	 //close child window
	 driver.close();
	 //switch back to parent window
	// driver.switchTo().window(ParentTabId);
	// driver.switchTo().defaultContent();
	
	}
	}
}
	

	 
	
	
	

	


