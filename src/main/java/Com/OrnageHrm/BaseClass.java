package Com.OrnageHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	 static WebDriver driver;

	public static void launchBrowser(String browserName) {
		
		switch (browserName) {
		
		case"chrome" :
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case"mozilla" :
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case"edge" :
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		
			  default :
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}

		}
	  public static void login(String username,String password)
	  {
		  driver.findElement(By.id("txtUsername")).sendKeys(username);
		  driver.findElement(By.id("txtPassword")).sendKeys(password);
		  driver.findElement(By.id("btnLogin")).click();
	  }
	  
}

