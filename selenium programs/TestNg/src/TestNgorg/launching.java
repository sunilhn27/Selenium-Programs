package TestNgorg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class launching {
	static WebDriver d;

	@BeforeMethod
	private void syso() {
		System.out.println("ghi");
	}
	
	
	
	@Test
	
	public void A() {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
	}

	@Test
	public void C() {
		d.close();

		System.out.println("2");

	}

	@Test(dependsOnMethods = "A")
	public void B() {
		d.get("http://www.google.co.in");
		d.manage().window().maximize();
	}

}
