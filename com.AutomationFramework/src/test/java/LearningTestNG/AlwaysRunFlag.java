package LearningTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRunFlag {
  
	
	
  @Test(enabled = true)
  public void login() 
  {
	  Assert.fail();
	  Reporter.log(" login method", true);
  }
  
  @Test(dependsOnMethods = "login")
  public void addToCart()
  {
	  Reporter.log(" Add to cart method", false);
	  
  }
  
  
  @Test(dependsOnMethods = "addToCart",alwaysRun = true)
  public void logout()
  {
	 Reporter.log(" logout method", true); 
  }
}
