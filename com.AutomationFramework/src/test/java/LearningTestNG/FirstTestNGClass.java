package LearningTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass {
  @Test(priority=1)
  public void login()
  {
	  Reporter.log("This is Login Method");
  }
  
  @Test
  public void addToCart() 
  {
	  Reporter.log("This is Login Method");
  }

  @Test
  public void logOut()
  {
 Reporter.log("This is Login Method");
  }
  
}
