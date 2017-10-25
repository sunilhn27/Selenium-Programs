package TestNgorg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class optional {

	static WebDriver d;

	@Test(priority = 1)
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
	}

	@Test(priority = 2)
	@Parameters({ "para" })
	public void parameter1(String username) {
		d.findElement(By.id("user")).sendKeys(username);
		System.out.println(username);

	}

	@Test(priority = 3)
	@Parameters({ "para1" })
	public void parameter2(@Optional("passwordis53131644") String password) {
		d.findElement(By.id("pass")).sendKeys(password);
		System.out.println(password);
		

	}
	@AfterClass
	public void close() throws Exception{
		Thread.sleep(5000);
		d.close();
	}

}
