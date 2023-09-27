package org.testng;

import org.testng.annotations.*;

public class DependsOnMethod {
	
	@Test(dependsOnMethods = {"Login"})
	public void Username() {
		System.out.println("Karthik");
	}
	
	@Test(dependsOnMethods = {"Username"})
	public void Password() {
		System.out.println("###2430");
	}
	
	@Test
	public void Login() {
		System.out.println("DependsOnMethods");
	}

}
