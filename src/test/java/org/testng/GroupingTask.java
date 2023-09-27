package org.testng;

import org.testng.annotations.Test;

public class GroupingTask {
	
	@Test(priority=2,groups= {"smoke"})
	 public void Test1() {
		 String s = "Test1";
		 System.out.println(s);
		 
	 }
	@Test(priority=3,groups= {"regression"})
	 public void Test2() {
		 String s = "Test2";
		 System.out.println(s);
}
	@Test(priority=1,groups= {"sanity"})
   public void Test3() {
	    String s ="Test3";
		System.out.println(s);
		}
}

