package Com.OrnageHrm;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class CrmLogin extends BaseClass {
  @BeforeClass
  @Parameters({"username","password","browser","url"})
  public void beforeClass(String username,String password,String browser,String url ) {
	  launchBrowser(browser) ;
		driver.get(url);
		Orangehrmlogin.login(username, password);
		
		
  }

}
