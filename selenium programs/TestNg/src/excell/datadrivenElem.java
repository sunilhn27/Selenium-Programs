
package excell;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class datadrivenElem {

	static WebDriver d;
	public static WebElement user;
	public static WebElement pass;
	public static WebElement login_submit;
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		d.manage().window().maximize();


	}

}
