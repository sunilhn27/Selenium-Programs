package listeners1;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class lis1 implements ISuiteListener, ITestListener {

	@Override
	public void onFinish(ISuite arg0) {

		System.out.println("suite finished" + arg0.getName());
		Reporter.log("yugu");

	}

	@Override
	public void onStart(ISuite arg0) {
		System.out.println("suite started" + arg0.getName());
		Reporter.log("yugu");
	}

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("test finished" + arg0.getName());
		Reporter.log("yugu");
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Test started" + arg0.getName());
		Reporter.log("yugu");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("percentage of fail" + arg0.getName());
		Reporter.log("yugu");
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("failed test cases" + arg0.getName());
		Reporter.log("yugu");
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("skipped test cases" + arg0.getName());
		Reporter.log("yugu");
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("ontest start" + arg0.getName());
		Reporter.log("yugu");
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("test result " + arg0.getName());
		Reporter.log("yugu");
	}

}
