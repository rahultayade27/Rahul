package Com.OrnageHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "A:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		WebElement Dashboard = driver.findElement(By.id("menu_dashboard_index"));

		if (Dashboard.isDisplayed()) {
			System.out.print("Successfully Login");
		}

		else {
			System.out.print("Login failed message displaed");
		}

		driver.findElement(By.id("menu_pim_viewPimModule")).click();

		WebElement clickPIM = driver.findElement(By.id("menu_pim_viewPimModule"));

		if (clickPIM.isDisplayed()) {
			System.out.print("PIM page should be dislplayed");
		} else {
			System.out.print("login failed message Displayed");
		}
		
		/*
		 * driver.findElement(By.id("menu_pim_addEmployee")).click(); String firstName =
		 * "jhon"; String lastName = "lisa";
		 * driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(
		 * firstName); WebElement name =
		 * driver.findElement(By.id("empsearch_employee_name_empName"));
		 * driver.findElement(By.id("searchBtn")).click();
		 */
		WebElement selectCheckBox = driver.findElement(By.id("ohrmlist_chkselectAll"));
		if (selectCheckBox.isSelected()) {
			System.out.println("checkbox is selected");
		} else {
			System.out.println("checkbox is not selected");
		}
		
	}

}
