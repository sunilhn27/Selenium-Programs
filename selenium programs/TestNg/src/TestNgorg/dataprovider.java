package TestNgorg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

	static WebDriver d;

	@Test(priority = 1)
	public void launch(String browser) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		if (browser.equalsIgnoreCase("chrome")) {
			d = new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\suniljar\\ieserver\\IEDriverServer.exe");
			d = new InternetExplorerDriver();
			d.manage().window().maximize();
			d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		}
	}

	@Test(priority = 2)
	@DataProvider
	public Object[][] user() {
		return new Object[][] { { "sunilhn@htmgltech.in", "sunil@065" }, { "raju", "password2" },
				{ "sagar", "31564646" }, { "sunilghn@htmltech.in", "sunil@065" } };

	}

	@Test(priority = 3, dataProvider = "user")
	public void data(String user, String pass) throws InterruptedException {
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

		}
		d.findElement(By.id("user")).clear();
		d.findElement(By.id("pass")).clear();

	}

}
