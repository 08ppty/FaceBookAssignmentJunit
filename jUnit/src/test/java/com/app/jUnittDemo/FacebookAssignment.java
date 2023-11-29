package com.app.jUnittDemo;


 
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAssignment {

		
	 
			 
			 
				
		  
				@Test
				
				public void A() {
					
					WebDriver driver = new ChromeDriver();
					 
					driver.manage().window().maximize();
					
					driver.manage().deleteAllCookies();
					
				
				driver.get("https://www.facebook.com");
				driver.findElement(By.xpath("//*[@id='email']")).sendKeys("admin@gmail.com");
				driver.findElement(By.id("passContainer")).sendKeys("Qwerty123_");
				driver.findElement(By.id("loginbutton")).click();
				}
				
				
				
				
				
//			
//			public void B() {		
//				WebDriver driver = new ChromeDriver();
//				
//				
//				driver.findElement(By.xpath("//*[@id='email']")).sendKeys("admin@gmail.com");
//			}
//				
//				 
//				@Test		
//			public void C() {		
//			WebDriver driver = new ChromeDriver();
//					 
//				driver.findElement(By.id("passContainer")).sendKeys("Qwerty123_");
//			
//			}
//			
//			@Test
//			public void t() {		
//				
//				WebDriver driver = new ChromeDriver();
//				driver.findElement(By.id("loginbutton")).click();
//		 		
//	           
//				
//			}
//				
			

		
		
		
		
		
		
		
		
	}

	
	
	

