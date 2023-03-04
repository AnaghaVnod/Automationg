package com.norka2022.test;

import org.testng.annotations.Test;

public class Home {
	
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

}
