package taskday1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class url {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		String s=d.getCurrentUrl();
		System.out.println(s);
		d.findElement(By.id("user")).sendKeys("sunilhn@htmltech.in");
		d.findElement(By.id("pass")).sendKeys("sunil@065");
		d.findElement(By.id("login_submit")).click();
		String s1=d.getCurrentUrl();
System.out.println(s1);
	}

}
