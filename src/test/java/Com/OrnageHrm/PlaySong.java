package Com.OrnageHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaySong {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "A:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		//driver.findElement(By.id("container")).sendKeys("Romantic");
		driver.navigate().to("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}


