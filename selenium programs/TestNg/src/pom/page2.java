package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class page2 {
	static WebDriver d;
	public	static String URL = "https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en";

	public	static By username = By.id("user");
	public	static By password = By.id("pass");
	public	static By login = By.id("login_submit");}

	/*public void enteringdata(String user, String pass) {
		d.get(URL);
		d.findElement(username).sendKeys(user);
		d.findElement(password).sendKeys(pass);
		d.findElement(login).click();

	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		page2 p = new page2();
		p.enteringdata("sunil", "sunil@065");

	}

}
*/