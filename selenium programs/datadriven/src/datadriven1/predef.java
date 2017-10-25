package datadriven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class predef {

	static WebDriver d;
	public static WebElement user;
	public static WebElement pass;
	static WebElement login_submit;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		d.manage().window().maximize();
		PageFactory.initElements(d, predef.class);

		predefmethods.setpath();
		for (int i = 0; i < 4; i++) {
			user.clear();
			user.sendKeys(predefmethods.getdata(i, 0));
			pass.sendKeys(predefmethods.getdata(i, 1));
			login_submit.click();
			predefmethods.setcelldata(i, 2, "pass");
			predefmethods.setcelldata(i, 3, "fffff");
			System.out.println(predefmethods.getdata(i, 1));
		}

	}

}
