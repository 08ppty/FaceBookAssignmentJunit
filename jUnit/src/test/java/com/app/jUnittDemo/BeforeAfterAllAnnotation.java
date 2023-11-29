package com.app.jUnittDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeAfterAllAnnotation {

	
	

	@BeforeAll // It will be executed before all test methods
	public void init() {

		System.out.println("Start the DB");
		System.out.println("Initalization Done..");

	}

	@AfterAll // It will be executed after all test methods execution completed
	public void tearDown() {

		System.out.println("Stop the DB");
	}

	@Test
	public void method1() {

		System.out.println("Executing method 1 of code class");
	}

	@Test
	public void method2() {

		System.out.println("Executing method 2 of code class");
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
