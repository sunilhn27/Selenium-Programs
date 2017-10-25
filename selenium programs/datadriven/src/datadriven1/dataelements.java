package datadriven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class dataelements {

	static WebDriver d;
	public static WebElement user;
	public static WebElement pass;
	static WebElement login_submit;
	static WebElement lnkHeaderLogout;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		d.manage().window().maximize();
		PageFactory.initElements(d, dataelements.class);
		data.run();

	}

}
