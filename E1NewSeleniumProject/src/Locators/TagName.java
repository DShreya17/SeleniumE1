package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();//Launch the browser
		driver.manage().window().maximize();//To maximize the browser window
		driver.get(" ");//to launch Web Application
		Thread.sleep(2000);
		
		WebElement textbox = driver.findElement(By.tagName("input"));//Find password textfield on the webpage.
		textbox.sendKeys("manager");//to pass the inputs to password textfield.
		
		//NOTE:Inputs are passed to username textfield because it is the 1st element designed with input tag.
		
	}

}
