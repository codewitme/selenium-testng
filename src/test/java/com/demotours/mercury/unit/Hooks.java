package com.demotours.mercury.unit;

import java.io.File;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Hooks {
	@BeforeTest
	public void beforeTest(){
		System.out.println("setup-beforetest");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("cleanup-aftertest");
	}
	@BeforeGroups(groups={"smoke"})
	public void beforeGroup(){
		System.out.println("setup-beforeGroup");
	}
	@AfterGroups(groups={"smoke"})
	public void afterGroup(){
		System.out.println("cleanup-afterGroup");
	}
	
	
}
