package handlingXl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webmailxl {

	static WebDriver d;
	public static WebElement user;
	public static WebElement pass;
	static WebElement login_submit;
	static WebElement lnkHeaderLogout;

	public static void main(String[] args) throws Exception {

		d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		xl1 x = new xl1();
		

		

		x.data();
		
	}
}