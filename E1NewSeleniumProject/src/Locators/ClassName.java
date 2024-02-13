package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();//Launch the browser
		driver.manage().window().maximize();//To maximize the browser window
		driver.get("https://www.facebook.com/ ");//to launch Web Application
		Thread.sleep(2000);
		
		WebElement passTextBox =driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
		 passTextBox.sendKeys("Admin");
		 

	}

}
