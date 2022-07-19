package Com.OrnageHrm;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddEmpTestCase1{
	
	


	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","A:\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	//	driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	//	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("txtUsername")).sendKeys("Adminee");
		driver.findElement(By.id("txtPassword")).sendKeys("admin12355");
		driver.findElement(By.id("btnLogin")).click();
		WebElement invalidPage=driver.findElement(By.id("spanMessage"));
		if(invalidPage.isDisplayed())
		{ System.out.print("Dashborad page should be displayed");
		}
		else
		{ System.out.print("invalid credential massage should be displayed");
		}
	}
		
	

	}


		



