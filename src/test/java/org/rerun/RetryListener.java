package org.rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {
	
	int failedcount=0;
	int limit=4;
     
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(failedcount<limit) {
			failedcount++;
			return true;
		}
		return false;
	}

}
