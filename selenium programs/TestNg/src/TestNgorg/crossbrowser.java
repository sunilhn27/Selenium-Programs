package TestNgorg;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class crossbrowser {
	static WebDriver d;

	@Parameters({ "browser" })
	@BeforeTest
	public void launch(String browser) {
		if (browser.equalsIgnoreCase("1")) {
			System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
			d = new ChromeDriver();
			d.get("http://www.google.co.in");

		} else if (browser.equalsIgnoreCase("3")) {
			//System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
			d = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("2")) {
			System.setProperty("webdriver.ie.driver", "D:\\suniljar\\ieserver\\IEDriverServer.exe");
			d = new InternetExplorerDriver();
			d.manage().window().maximize();
			d.get("http://www.google.co.in");
		}

	}

	@AfterTest
	public void test() {
		d.close();

	}
}