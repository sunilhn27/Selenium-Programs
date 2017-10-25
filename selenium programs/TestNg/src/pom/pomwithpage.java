package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class pomwithpage {
	static String URL = "https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en";
	static WebDriver d;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get(URL);
		d.manage().window().maximize();
		PageFactory.initElements(d, pomwithpagefactory.class);
		pomwithpagefactory p = new pomwithpagefactory();
		p.login();
		p.compose();



	}

}
