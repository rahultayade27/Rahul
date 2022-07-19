package Com.OrnageHrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class searchAppliance extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.get("https://www.amazon.in");
		WebElement searchDropdown=driver.findElement(By.id("searchDropdownBox"));
		
		Select select=new Select(searchDropdown);
		
		select.selectByVisibleText("Appliances");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("washing machine");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		  List<WebElement>  element =driver.findElements(By.xpath("//div[@data-component-type='s-search-result']/descendant::h2/a/span"));
		  
		  for(WebElement web:element)
			  
		  {
			    String s1=web.getText();
			    System.out.println(s1);
			    
		  }
	}

}
