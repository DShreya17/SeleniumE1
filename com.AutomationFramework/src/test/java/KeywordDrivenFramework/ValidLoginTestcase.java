package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ValidLoginTestcase extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		
		Flib flib = new Flib();
		
		String data = flib.readPropertyData("./src/test/resources/config.properties", "browser");
		
		System.out.println(data);
	}

}
