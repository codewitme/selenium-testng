package com.demotours.mercury.unit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SomemoreUnitTests {
	@BeforeClass
	public void setup(){
		System.out.println("setup-somemoreunit");
	}
	@Test
	public void firstTest(){
		System.out.println("somemoreunit-firsttest");
	}
	@Test(groups={"smoke"})
	public void secondTest(){
		System.out.println("somemoreunit-secondtest");
	}
	@AfterClass
	public void cleanup(){
		System.out.println("cleanup-somemoreunit");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("somemoreunit-beforemethod");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("somemoreunit-aftermethod");
	}
}
