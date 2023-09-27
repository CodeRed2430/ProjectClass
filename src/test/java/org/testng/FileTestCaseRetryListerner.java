package org.testng;

import org.testng.annotations.Test;

public class FileTestCaseRetryListerner {
	@Test
	public void Test1() {
		String ss="Karthik";
		Assert.assertTrue(ss.equals("Karthik"));
	
	}

	@Test(retryAnalyzer=IRetryLisenter.class)
	public void Test2() {
		String s="Karthikeyan";
		Assert.assertTrue(s.equals("Karthik"));

	}
}




