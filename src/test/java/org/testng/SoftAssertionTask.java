package org.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTask {

			@Test
			public void Test1() {
			SoftAssert s = new SoftAssert();
				String ss="Karthik";
				s.assertTrue(ss.equals("Karthik"));
				s.assertFalse(ss.equals("Karthikeyan"));
				s.assertAll();
			}

			@Test
			public void Test2() {
				String s="Karthikeyan";
				Assert.assertTrue(s.equals("Karthikeyan"));
				Assert.assertFalse(s.equals("Karthik"));
			}
	}

