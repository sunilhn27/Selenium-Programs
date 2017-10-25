package listeners1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class webmaillisteners {

	static WebDriver d;

	@Test(priority = 1, groups = { "login" })
	public void url() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		d.manage().window().maximize();
	}

	@Test(priority = 2)
	public void login() {
		d.findElement(By.id("user")).sendKeys("sunilhn@htmltech.in");
		d.findElement(By.id("pass")).sendKeys("sunil@065");
		d.findElement(By.id("login_submit")).click();

	}

	@Test(priority = 3)

	public void compose() {

		d.switchTo().frame("mailFrame");
		d.findElement(By.id("rcmbtn107")).click();
		d.findElement(By.xpath(".//*[@id='_to']")).sendKeys("subnioniobnsvf");
		d.findElement(By.xpath(".//*[@id='compose-subject']")).sendKeys("aiusfb");
		d.findElement(By.id("composebody")).sendKeys("safousghe");
		d.findElement(By.xpath(".//*[@id='rcmbtn106']")).click();
		d.switchTo().alert().accept();
	}

	@Test(priority = 4)
	public void AddressBook() {

		d.switchTo().frame("mailFrame");
		d.findElement(By.xpath(".//*[@id='rcmbtn103']/span[1]")).click();
		d.findElement(By.xpath(".//*[@id='rcmbtn113']/span")).click();
		d.switchTo().alert();
		d.findElement(By.xpath(".//*[@id='ui-id-3']/label/input")).sendKeys("sunil");

	}

}
