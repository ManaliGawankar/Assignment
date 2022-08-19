package Academy.MyntraFramework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import resources.ExtentReporterNG;

public class Listeners implements ITestListener{
	ExtentReports extent=ExtentReporterNG.getReportObject();

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
		
	}
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		ExtentTest test=extent.createTest("Initial Demo");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	

}
