package datacompare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginmain {
	static WebDriver d;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		d.manage().window().maximize();
		for (int i = 1; i < 4; i++) {
			d.findElement(By.id("user")).clear();
			loginlogic.setpath();
			String user = loginlogic.getdata(i, 0);
			String pass = loginlogic.getdata(i, 1);

			d.findElement(By.id("user")).sendKeys(user);
			d.findElement(By.id("pass")).sendKeys(pass);
			d.findElement(By.id("login_submit")).click();
			String s = "Webmail-Login";
			if (s.equalsIgnoreCase(d.getTitle())) {
				loginlogic.setcelldata1(i, 2, "pass");

			} else {
				loginlogic.setcelldata1(i, 2, "Fail");
			}
			Thread.sleep(2000);

		}
		d.close();
	}

}
