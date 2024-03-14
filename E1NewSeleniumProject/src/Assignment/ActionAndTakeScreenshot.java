package Assignment;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ActionAndTakeScreenshot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/goldmine.html?gmfidv=GMS25");
		
	    WebElement coins = driver.findElement(By.xpath("//a[@title='Coins']"));
	    Actions act = new Actions(driver);
	    act.moveToElement(coins).perform();
	    driver.findElement(By.xpath("//span[text()='1 gram']")).click();
	    WebElement we = driver.findElement(By.xpath("//div[@class='mousetrap']"));
	    boolean res = we.isDisplayed();
	    System.out.println(res);
	    
	    rwd = 
        File src = driver.getScreenshotAs(OutputType.FILE);//To take the screenshot
		
		File dest = new File("./screenshots/Facebook.jpg");//To specify the location, name and extensions
		
		Files.copy(src, dest);//To copy and paste the screenshot in the specified folder.
	    
	
		

	}

}
