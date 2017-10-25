package TestNgorg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class usr {
static WebDriver d; 
	
	
	@Test
	public void launch(){
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
	}

@Test 
public void navigate(){
	d.get("https://www.javatpoint.com/java-tutorial");
	
	
}
}

