package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pomwithpagefactory {
	static WebDriver d;
	static String URL = "https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en";

	public static WebElement user;
	public static WebElement pass;
	public static WebElement login_submit;

	@FindBy(how = How.XPATH, using = ".//*[@id='rcmbtn107']")
	public static WebElement compose;
	@FindBy(how = How.XPATH, using = ".//*[@id='_to']")
	public static WebElement To;
	@FindBy(how = How.XPATH, using = ".//*[@id='compose-subject']")
	public static WebElement subject;
	@FindBy(how = How.XPATH, using = ".//*[@id='composebody']")
	public static WebElement body;

	public void login() {

		user.sendKeys("sunilhn@htmltech.in");
		pass.sendKeys("sunil@065");
		login_submit.click();
	}

	public void compose() {
		d.switchTo().frame("mailFrame");
		compose.click();
		To.sendKeys("afwiufaw");
		subject.sendKeys("psoegmkfm");
		body.sendKeys("oashfioj");

	}

/*	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get(URL);
		d.manage().window().maximize();
		PageFactory.initElements(d, pomwithpagefactory.class);
		pomwithpagefactory p = new pomwithpagefactory();
		p.login();
		p.compose();

	}*/
}
