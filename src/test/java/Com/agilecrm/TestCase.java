package Com.agilecrm;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestCase {
  @Test
  public void beforeMethod() {
	  System.out.println("this is before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is before test method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is before suit method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is after suit method");
  }
  

}
