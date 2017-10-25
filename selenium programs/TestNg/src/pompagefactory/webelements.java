package pompagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class webelements {
	static WebDriver d;
	static String URL = "https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en";

	@FindBy(how = How.NAME, using = "firstname")
	public static WebElement fname;
	@FindBy(how = How.NAME, using = "lastname")
	public static WebElement Lname;
	@FindBy(how = How.NAME, using = "email_address")
	public static WebElement email;
	@FindBy(how = How.NAME, using = "company")
	public static WebElement company;
	@FindBy(how = How.NAME, using = "street_address")
	public static WebElement address;
	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;



	public static void testdata() {
		fname.sendKeys("svgn");
		Lname.sendKeys("asegdgf");
		email.sendKeys("segsfc");
		company.sendKeys("sefi");
		address.sendKeys("sefs");
		city.sendKeys("fg");

	}
}
