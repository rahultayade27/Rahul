package testNGoOrangeHrm;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class TestListner implements ITestNGListener,ISuiteListener {
		
		
		public void onStart(ISuite suite)
		{
			System.out.println("This is a onStart Suite Method");
			String reportFolderPath=System.getProperty("user.dir") + "/ExtentReport";
			createFolder(reportFolderPath);
			
			// EexucationReport_8_8_2022_13.25 dd_mm_yyyy_hh_mm
			
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm");
			String dateTime=formatter.format(LocalDateTime.now());
			String reportPath= "EexecuationReport_" + dateTime;
			createFolder(reportFolderPath + "/" + reportPath);
		
			
		}
		
		public void onFinish(ISuite suite)
		{

			System.out.println("This is a onFinish Suite Method");
		}
		public void onStart(ITestContext context) 
		{
			System.out.println("This is a onTest Start Suite Method....." + context.getName());
		}
		public void onFinish(ITestContext context) 
		{
			System.out.println("This is a onTest Finish Suite Method....." +context.getName());
			
		}
	    public void onStart(ITestResult Result)
		{
	    	System.out.println("Test execuation started for method....." + Result.getName());
			
		}
	    public void onTestSuccess(ITestResult Result)
	  		{
	    	
	    	System.out.println("method execuation completed succesfully....." + Result.getName());
			
	  		}
	    public void onTestFailure(ITestResult Result)
	    {
	    	System.out.println("method execuation failed for: " + Result.getName());
			System.out.println("failure Reson:" + Result.getName());
		}
	    public void onTestSkipped(ITestResult Result)
	    {
	    	System.out.println("method Skipped and Name is:" + Result.getName());
	    	
	    }
	    public void createFolder(String FilePath)
	    {
	    	File file = new File(FilePath);
	    	if (!file.exists()) {
	    		file.mkdir();
	    	}
	    }
}

		
			

		

	


