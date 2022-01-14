package test;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener {
	public void onTestStart (ITestResult result) {
		System.out.println("Test is started "+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success of test cases and its details are:" +result.getName());
	}
		
		public void onTestFailure(ITestResult result) {
			System.out.println("Hello this failed :" +result.getName());
		}
		public void onTestSkipped(ITestResult result) {
			System.out.println("Skip of test cases and its details are :" +result.getName());
		}
		public void onTestFailureButWithinSuccesspercentage(ITestResult result) {
			
		}
		public void onStart(ITestContext context) {
		}
		public void onFinish(ITestContext context) {
		}
		
		}
	
	
	
	


