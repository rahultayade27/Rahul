package Com.OrnageHrm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOprations extends BaseClass {

	public static void main(String[] args) throws AWTException  {
		launchBrowser("edge");
		driver.get("https://www.amazon.in/");
		
		Actions act=new Actions(driver);
	    //act.contextClick().build().perform();
		//WebElement rightclick  = driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"));	
		//act.contextClick(rightclick).build().perform();
			
		//WebElement doubleClick = driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"));
		//act.doubleClick(doubleClick).build().perform();
		
		//Robot robot=new Robot();
		//robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		//robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
	  WebElement  rightclick  =	driver.findElement(By.xpath("//a[text()=\"Best Sellers\"]"));
	 act.contextClick(rightclick).build().perform();
	 
	 Robot robot=new Robot();
	 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	 robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 
	 robot.keyPress(KeyEvent.VK_ENTER);
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 
	  String parentId =driver.getWindowHandle();
	  System.out.println(parentId);
	  
	  
	  Set<String>Ids=driver.getWindowHandles();
	  System.out.println(Ids);
	  
	  for(String Id: Ids)
	  {
		  if(!Id.equals(parentId))
		  {
			  System.out.println(Id);
			driver.switchTo().window(Id);
			System.out.println( driver.getTitle());
			driver.close();
			  
		  }
	  }
	  
	}
}
