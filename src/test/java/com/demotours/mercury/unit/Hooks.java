package com.demotours.mercury.unit;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
	WebDriver driver;
	@BeforeTest
	public void beforeTest(){
		
	}
	@AfterTest
	public void afterTest(){
		System.out.println("cleanup-aftertest");
	}
	@BeforeGroups(groups={"smoke"})
	public void beforeGroup(){
		System.out.println("setup-beforeGroup");
		System.out.println("setup-beforetest");
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@AfterGroups(groups={"smoke"})
	public void afterGroup(){
		System.out.println("cleanup-afterGroup");
	}
	
	
}
