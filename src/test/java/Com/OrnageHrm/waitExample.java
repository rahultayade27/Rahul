package Com.OrnageHrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitExample extends BaseClass {

	public static void main(String[] args) {
		BaseClass.launchBrowser("chrome");
		//implicitywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com");
       BaseClass .login("Admin", "admin123");
       driver.findElement(By.id("welcome")).click();
       
       //Explicitywait
       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
       
       wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout"))).click();
	}

}
