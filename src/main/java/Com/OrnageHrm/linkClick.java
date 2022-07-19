package Com.OrnageHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.findElement(By.xpath("//img[@src=\"/static/images/zerodha-logo.svg\"]")).click();
		
		driver.findElement(By.linkText("Signup")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("About")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Products")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Pricing")).click();
		driver.navigate().back();
		 
		 
	}

}
