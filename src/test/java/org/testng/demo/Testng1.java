package org.testng.demo;

import org.testng.annotations.Test;

public class Testng1 {

		@Test(priority=2)
		private void tc0() {
			System.out.println("method 1");

		}
		
		
		@Test(priority=-1)
		private void tc1() {
			System.out.println("method2");

		}
		@Test(priority=-3)
		private void tc2() {
			System.out.println("method3");
		}
		
		
		
	}

