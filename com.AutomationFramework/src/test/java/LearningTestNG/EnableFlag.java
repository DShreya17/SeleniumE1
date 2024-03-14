package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableFlag {
  
	
  @Test(enabled = true)
  public void login() 
  {
	  Reporter.log("This is login method", true);
  }
  
  @Test(enabled = false)
  public void addToCart()
  {
	  Reporter.log("This is Add to cart method", false);
	  
  }
  
  
  @Test(enabled = true)
  public void logout()
  {
	 Reporter.log("This is logout method", true); 
  }
}


