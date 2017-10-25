package TestNgorg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
static WebDriver d;



@Test
public void launch(){
	System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
	d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://www.google.co.in");

}
	
	
	@Test
	@Parameters({"t1"})
	public void textbox(String text){
		d.findElement(By.id("lst-ib")).sendKeys(text);
		System.out.println(text);
	}
}
