package TestNgorg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovidr1 {

	static WebDriver d;

	@Test(priority = 1)
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");

	}

	
	@DataProvider(name="provider")
	public  Object[][] data() {
		return new Object[][] { { "sunikl", "sagar"}, {"fsefse", "seffs" } ,{"asdb","afnfa"},{"usbniuadbn","snain"} };
	}

	@Test(priority = 3,dataProvider="provider")
	public void enterdata(String unname, String pass) throws Exception {
		d.findElement(By.id("user")).sendKeys(unname);
		d.findElement(By.id("pass")).sendKeys(pass);
		Thread.sleep(2000);
		d.findElement(By.id("user")).clear();
		d.findElement(By.id("pass")).clear();
	}
}
