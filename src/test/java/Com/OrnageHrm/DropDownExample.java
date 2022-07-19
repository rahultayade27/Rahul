package Com.OrnageHrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample extends BaseClass {

	public static void main(String[] args) throws Exception{
	BaseClass.launchBrowser("chrome");
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	
	login("Admin","admin123");
	
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	
	//WebElement empStatusDropDown=driver.findElement(By.id("empsearch_employee_status"));
	
	//Select select=new Select(empStatusDropDown);
	
	//select.selectByIndex(1);
	
	// select.selectByVisibleText("Full-Time Probation");
	
	//  select.selectByValue("4");
	  
	
	/*WebElement empJobTitle=driver.findElement(By.id("empsearch_job_title"));
	
	
	//Select select=new Select( empJobTitle);
	
	//select.selectByIndex(16);
	
	//select.selectByValue("6");
	
	//select.selectByVisibleText("Software Engineer");
	 * 
	 */
	  
	WebElement empInclude=driver.findElement(By.id("empsearch_termination"));
	
	Select select=new Select(empInclude);
	
	//select.selectByIndex(2);
	
	//select.selectByValue("3");
	
	//select.selectByVisibleText("Current Employees Only");
	
	//select.deselectByIndex(2);
	
	List<WebElement> allSelectedOptions= select.getAllSelectedOptions();
	for(WebElement element:allSelectedOptions)
	{ 
		System.out.println(element.getText());
	}
	
	   List<WebElement>  allDropDownValues =select.getOptions();
	   for( WebElement element: allDropDownValues )
	   {
		   System.out.println(element.getText());
		   if(element.getText().equals("Current Employees Only"));
		   {
			   throw new Exception ("Current Employees Only present on include Dropdown");
		   }   
	   }
}
}

			
			
	  
	 
	
	
	

	
	

	

	


