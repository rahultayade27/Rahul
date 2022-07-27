package Com.OrnageHrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class util extends BaseClass{
	public static void waitforElementToBeClick(By element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
			public static void waitforElementToBeVisible(WebElement element) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(element));

}
//			public static void fluentWait(final WebElement element) {
//				Wait <WebDriver>wait =new FluentWait<WebDriver>(driver).withTimeout (Duration.ofSeconds(10));
//				.pollingEvery(Duration.ofSeconds(2))
//				.ignoring(Exception.class);
//				wait.until(new Function<WebDriver,WebElement>(){
//					public WebElement apply (WebDriver driver) {
//						System.out.println("checking element perform action");
//						return element;
//					}
//				});
			}
			
