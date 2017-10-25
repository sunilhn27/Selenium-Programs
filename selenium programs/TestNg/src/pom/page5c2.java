package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class page5c2 {
	static WebDriver d;
	//static page2 p;

	public static void enteringdata(String user, String pass) {
		d.get(page2.URL);
		d.findElement(page2.username).sendKeys(user);
		d.findElement(page2.password).sendKeys(pass);
		d.findElement(page2.login).click();

	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		page5c2 p=new page5c2();
		enteringdata("sunil", "sunil@065");

}
}
