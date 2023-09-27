package org.testng;

public class IRetryLisenter implements IRetryAnalyzer{

	int min=1,max=10;
	public boolean retry(ITestResult result) {
		if(min<=max) {
			min++;
			return true;
	}
		return false;
	}

}
