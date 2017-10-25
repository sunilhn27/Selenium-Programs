package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page4 {
	static String URL = "https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en";
	public static WebElement user;

	@FindBy(xpath = ".//*[@id='pass']")
	public static WebElement std_textbox;
	public static WebElement login_submit;
	static WebDriver d;

	public static void test() {
		user.sendKeys("sunil");
		std_textbox.sendKeys("avsdyuvu");
		login_submit.click();
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get(URL);
		d.manage().window().maximize();
		PageFactory.initElements(d, page4.class);
		test();

	}

}
