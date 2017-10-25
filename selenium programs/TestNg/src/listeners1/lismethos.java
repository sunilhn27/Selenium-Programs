package listeners1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

@Listeners(listeners1.lis1.class)	
public class lismethos {

	static WebDriver d;

	@Test(priority = 1)
	public void url() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		d.manage().window().maximize();
	}

	@Test(priority = 2)
	public void maximize() {
		System.out.println("sgsd");

	}

	@Test(enabled = false)
	public void run() {
		System.out.println("running");
	}

	@Test(priority = 3)
	public void close() {
		d.close();

	}

}
