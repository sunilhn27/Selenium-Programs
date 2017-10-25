
package datadriven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class predefined3 {
	static WebDriver d;
	public static WebElement user;
	public static WebElement pass;
	static WebElement login_submit;
//	static WebElement lnkHeaderLogout;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		d.manage().window().maximize();
     //   int rowcount=predefined1.sh.getLastRowNum();
		for (int i = 0; i < 4; i++) {
			d.findElement(By.id("user")).clear();
			predefined1.setpath();
			String username = predefined1.getCellData(i, 0);
			String password = predefined1.getCellData(i, 1);
			predefined1.setcelldata(i, 2, "pass");
			predefined1.setcelldata(i, 3, "fail");
			// user.sendKeys(username);
			d.findElement(By.id("user")).sendKeys(username);
			d.findElement(By.id("pass")).sendKeys(password);
			
			d.findElement(By.id("login_submit")).click();
			
			// predefined1.getCellData(i, 1);
			// System.out.println(predefined1.CellData);
			// predefined1.setcelldata(i, 1, "jsdfhdfjs");
		}
	d.close();
	}
	
}
