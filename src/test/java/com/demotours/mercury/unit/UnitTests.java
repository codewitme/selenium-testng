package com.demotours.mercury.unit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UnitTests  {

	@BeforeClass
	public void setup(){
		System.out.println("setup-unit");
	}
	@Test(groups={"x"})
	public void firstTest(){
		Assert.assertFalse(true);
		System.out.println("unit-firsttest");
	}
	@Test(groups={"regression"})
	public void secondTest(){
		System.out.println("unit-secondtest");
	}
	@AfterClass
	public void cleanup(){
		System.out.println("cleanup-unit");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("unit-beforemethod");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("unit-aftermethod");
	}
}
