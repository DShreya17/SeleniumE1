package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethod {
  
  @Test(enabled = true)
  public void login() 
  {
	  Reporter.log(" login method", true);
  }
  
  @Test(dependsOnMethods = "login")
  public void addToCart()
  {
	  Reporter.log(" Add to cart method", false);
	  
  }
  
  
  @Test(dependsOnMethods = "addToCart")
  public void logout()
  {
	 Reporter.log(" logout method", true); 
  }
}


