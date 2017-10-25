package TestNgorg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class Assert {
static WebDriver d;
	
	
	@Test(priority = 1)
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.google.co.in");

	}
	@Test(priority=2)
	public void asserts(){
		org.testng.Assert.assertEquals("Google", d.getTitle());
		org.testng.Assert.assertEquals("Googl1e", d.getTitle(), "title is wrimg");
		org.testng.Assert.assertTrue(d.findElement(By.id("lst-ib")).isDisplayed());
		//org.testng.Assert.assertEquals(arg0, arg1, arg2);
	}
}
