package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/");
		
		Flib flib = new Flib();
		int rc = flib.getRowCount("./Data/testData.xlsx", "invalidcreds"); 
		
		for (int i=1; i<=rc; i++)
		{
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./Data/testData.xlsx","invalidcreds",i,0 ));
			Thread.sleep(1000);
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./Data/testData.xlsx","invalidcreds",i,1 ));
			Thread.sleep(1000);
			driver.findElement(By.id("loginButton")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.name("username")).clear();
		}
		
	}

}
