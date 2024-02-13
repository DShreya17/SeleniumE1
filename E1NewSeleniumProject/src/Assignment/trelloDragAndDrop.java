package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class trelloDragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://trello.com/b/tE8YK00t/mock");
		
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("shreyadhande17@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']"));
		driver.findElement(By.id("password")).sendKeys("Shre@9921");
		driver.findElement(By.xpath("//span[text()='Log in'")).click();
        
		driver.findElement(By.xpath("//div[text()='mock'])")).click();
		
		
		WebElement mockGiven = driver.findElement(By.xpath("//h2[text()='Mock given']"));
		WebElement mockPending = driver.findElement(By.xpath("//h2[text()='Mock pending']"));
		WebElement mockDone = driver.findElement(By.xpath("//h2[text()='Mock done']"));
	
		
		
		
		

	}

}
