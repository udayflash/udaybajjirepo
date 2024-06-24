package seltestng;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Listnertry implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		System.out.println(result.getName()+ "Test started");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println(result.getName()+ "Test success");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println(result.getName()+ "Test failed");
	}
}
