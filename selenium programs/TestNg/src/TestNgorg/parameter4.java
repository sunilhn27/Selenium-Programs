package TestNgorg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter4 {
	static WebDriver d;

	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
	}

	@Test
	@Parameters({ "user" ,"pass"})
	
	public void para1(String user, String pass) throws InterruptedException {
		d.findElement(By.id("user")).clear();
		d.findElement(By.id("pass")).clear();
		d.findElement(By.id("user")).sendKeys(user);
		d.findElement(By.id("pass")).sendKeys(pass);
		d.findElement(By.id("login_submit")).click();
		Thread.sleep(5000);
		String s = "Webmail Login";
		String s1 = d.getTitle();
		if (s1 != s) {
			d.findElement(By.id("lnkHeaderLogout")).click();
			d.findElement(By.id("user")).clear();
			d.findElement(By.id("pass")).clear();
		}
		
	}	
	
	@AfterMethod
	public void close(){
	d.close();
	}
	

}
