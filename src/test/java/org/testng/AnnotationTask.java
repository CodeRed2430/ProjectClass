package org.testng;

import org.testng.annotations.*;

public class AnnotationTask {
	
	@Test
	public void Test() {
		String s = "Sample";
		System.out.println(s);
	}
	
	@BeforeSuite
	public void Test1() {
		String s = "BeforeSuite";
		System.out.println(s);
	}
	
	@AfterSuite
	public void Test2() {
		String s = "AfterSuite!";
		System.out.println(s);
	}
	
	@BeforeClass
	public void Test3() {
		String s = "BeforeClass";
		System.out.println(s);
	}
	
	@AfterClass
	public void Test4() {
		String s = "AfterClass";
		System.out.println(s);
	}
	
	@BeforeMethod
	public void Test5() {
		String s = "BeforeMethod";
		System.out.println(s);
	}
	
	@AfterMethod
	public void Test6() {
		String s = "AfterMethod";
		System.out.println(s);
	}
	
	@BeforeTest
	public void Test7() {
		String s = "BeforeTest";
		System.out.println(s);
	}
	
	@AfterTest
	public void Test8() {
		String s = "AfterTest";
		System.out.println(s);
	}
	
	@BeforeGroups
	public void Test9() {
		String s = "BeforeGroups";
		System.out.println(s);
	}
	
	@AfterGroups
	public void Test10() {
		String s = "AfterGroups";
		System.out.println(s);
	}
	}


