package Groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class factory {
	WebDriver d;
	private String uname;
	private String pass;

	public factory(String uname, String pass) {
		this.uname = uname;
		this.pass = pass;
	}

	@Test
	public void uname() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		d.findElement(By.id("user")).sendKeys(this.uname);
		d.findElement(By.id("pass")).sendKeys(this.pass);
	}

	@Test
	public void gcr() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://www.gcrit.com/build3/login.php");
		d.manage().window().maximize();
		d.findElement(By.name("email_address")).sendKeys(this.uname);
		d.findElement(By.name("password")).sendKeys(this.pass);
	}

	public class testdata {

		@Factory
		public  Object[] data() {
			return new Object[] { new factory("sunil", "dsgvsdr"), new factory("aoindc", "asegwe") };

		}
	}
}
