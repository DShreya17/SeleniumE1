package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Hp Laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[text()='HP']/Preceding-sibling :: div[@class='_24_Dny']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='Core i5']/Preceding-sibling :: div[@class='_24_Dny']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='RAM Capacity'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='8 GB']/Preceding-sibling :: div[@class='_24_Dny']")).click();
		Thread.sleep(1000);
		
		
		List<WebElement>laptops = driver.findElements(By.xpath("//div[@CLASS= '4Rr01T']"));
		
		 List<WebElement> laptopPrices =driver.findElements(By.xpath("//div[@CLASS= '4Rr01T']/ancestor :: div[@class='_3pLy-c row']/descendant :: div[@class='_30jeq3_1_whn1'"));
		 for (int i=0; i< laptops.size(); i++);
		 {
		
	     }
         String op = laptops.get
         
}
