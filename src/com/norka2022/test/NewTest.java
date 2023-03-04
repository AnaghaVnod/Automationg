package com.norka2022.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	
  @BeforeTest
  public void bTest() 
  {
	  System.out.println("This happens before test");
  }
  @Test(priority=2)
  public void F()
  {
	  System.out.println("This is my test case");
  }
  @Test(priority=1)
  public void SecTest()
  {
	  System.out.println("This is my second test");
  }
  @AfterTest
  public void aTest()
  {
	  System.out.println("This happens after test");
  }
}
