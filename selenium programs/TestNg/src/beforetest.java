import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforetest {
static WebDriver d;
	@BeforeTest()
	public void launch(){
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
	}
	
	
	@Test
	public void maximize() {
		d.manage().window().maximize();
		
		d.get("http://www.google.co.in");
	}
	
	@AfterTest
	public void closing(){
		d.close();
		
		
	}
}
