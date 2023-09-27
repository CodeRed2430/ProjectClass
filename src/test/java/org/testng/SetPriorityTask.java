package org.testng;

import org.testng.annotations.Test;

public class SetPriorityTask {

	@Test(priority=3)
	 public void Test1() {
		 String s = "Test1";
		 System.out.println(s);
		 
	 }
	@Test(priority=1)
	 public void Test2() {
		 String s = "Test2";
		 System.out.println(s);
}
	@Test(priority=2)
	public void Test3() {
	    String s ="Test3";
		System.out.println(s);
		}
}
