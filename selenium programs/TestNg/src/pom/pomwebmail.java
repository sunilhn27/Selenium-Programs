package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class pomwebmail {
	static String URL = "https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en";
	static WebDriver d;
	By user = By.id("user");
	By pass = By.id("pass");
	By click = By.id("login_submit");

	By compose = By.id("rcmbtn107");
	By entertext = By.xpath(".//*[@id='_to']");
	By subject = By.xpath(".//*[@id='compose-subject']");
	By body = By.id("composebody");

	public void login() {

		d.findElement(user).sendKeys("sunilhn@htmltech.in");
		d.findElement(pass).sendKeys("sunil@065");
		d.findElement(click).click();

	}

	public void compose() {

		d.switchTo().frame("mailFrame");
		d.findElement(compose).click();
		d.findElement(entertext).sendKeys("subnioniobnsvf");
		d.findElement(subject).sendKeys("aiusfb");
		d.findElement(body).sendKeys("safousghe");

	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		PageFactory.initElements(d, page4.class);
		d = new ChromeDriver();
		d.get(URL);
		d.manage().window().maximize();
		pomwebmail p = new pomwebmail();
		p.login();
		p.compose();

	}

	@BeforeClass
	public void invoke() {

	}

}
