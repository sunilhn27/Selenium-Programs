package TestNgorg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginparameter {

	static WebDriver d;

	@Test(priority = 1)
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
	}

	@Test(priority = 2)
	@Parameters({ "user" })
	public void username(String user) {
		d.findElement(By.id("user")).sendKeys(user);
	}

	@Test(priority = 3)
	@Parameters({ "pass" })
	public void password(String pass) {
		d.findElement(By.id("pass")).sendKeys(pass);

	}

	@Test(priority = 4)

	public void click() {
		d.findElement(By.id("login_submit")).click();
	}
}