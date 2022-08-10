package Com.agilecrm;

import org.testng.annotations.Test;

public class TestMehtod {
  @Test(priority=1)
  public void login () {
	  System.out.println("This is 1st methods");
  }
  @Test(priority=1,dependsOnMethods="login")
  public void AddEmp (){
	  System.out.println("This is 2nd methods");
  }
  @Test(priority=3,dependsOnMethods={"AddEmp","login"})
  public void Logout() {
	  System.out.println("This is 3rd methods");
  }
}

