package com.demotours.mercury.unit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SomemoreUnitTests extends Hooks {
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
		driver.findElement(By.name("userName")).sendKeys("satya");
		driver.findElement(By.name("password")).sendKeys("satya");
		driver.findElement(By.name("login")).click();
		WebElement element =driver.findElement(By.partialLinkText("SIGN"));
		Assert.assertEquals("Failed:Because the actual is not same as the expected.","SIGN-ON", element.getText());
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
