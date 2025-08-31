package Practice_set;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{  
	
	public void OnStart(ITestContext context) {
		System.out.println("Test Started...");
		
	}
	public void OnFinish(ITestContext context) {
		System.out.println("Test Finished...");
		
	}
	public void OnTestSuccess(ITestResult Result) {
		System.out.println("Test Started...");
		
	}
	public void OnTestFailure(ITestResult Result) {
		System.out.println("Test Failed...");
		
	}
	public void OnTestSkipped(ITestResult Result) {
		System.out.println("Test Skipped...");
		
	}
	public void OnTestFailureButWithinSuccessPercentage(ITestResult Result) {
				
	}
	public void OnTestStart(ITestResult Result) {
		System.out.println("Test Starts...");
		
	}
	

}
