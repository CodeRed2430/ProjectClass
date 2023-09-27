package org.testng;

import org.testng.annotations.Test;

public class InvocationCaseTask {
	
	@Test(invocationCount=100)
	public void Test()
	{
		String s="Hello!";
		String ss="Hello!";
				
		Assert.assertEquals(s, ss);
		if(s.equals(ss))		
		System.out.println("Pass");
	else 
		System.out.println("Fail");
	}

}
