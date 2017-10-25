package taskday1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		d.findElement(By.id("user")).sendKeys("sunilhn@htmltech.in");
		String s = d.findElement(By.id("user")).getAttribute("value");
		System.out.println(s);
		;
	}

}
