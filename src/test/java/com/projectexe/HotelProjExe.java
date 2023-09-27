package com.projectexe;


import org.testng.annotations.Test;

import com.pageexecution.BookHotelExe;
public class HotelProjExe extends BookHotelExe{
	
@Test
		public void BrowserTest() {
		selectingBrowser("chrome");
		launching("https://adactinhotelapp.com/");
		}
@Test
		public void LoginTest() {
		username();
		password();
		login();
		}
@Test
		public void SearchTest() {
		location();
		hotel();
		room_type();
		room_nos();
		adult_room();
		child_room();
		submit();
		}
@Test
		public void SelectTest() {
		radiobutton();
		continue_button();
		}
@Test
		public void BookingTest() {
		fname();
		lname();
		address();
		ccno();
		cctype();
		ccmonth();
		ccyear();
		cvv();
		booking();
		orderID();
	}
	}
	
	

