package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformHorizontalSrollingOperation {

	public static void main(String[] args) throws InterruptedException {
		
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
        
        //to perform scroll right operation
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(500,0)");
        Thread.sleep(2000);
        
        //To perform scroll left operations
        js.executeScript("window.scrollBy(-150,0)");
        Thread.sleep(2000);
        
        driver.close();
        
        
	}

}
