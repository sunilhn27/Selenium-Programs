package mock1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webmail {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/");
		WebElement wb = d.findElement(By.id("user"));
		boolean b = wb.isDisplayed();
		if (b == true) {
			wb.sendKeys("sunilhn@htmltech.in");

			WebElement wb1 = d.findElement(By.id("pass"));
			boolean b1=wb1.isDisplayed();
			if (b == true) {
			wb1.sendKeys("sunil@065");
			wb.submit();
			d.findElement(By.id("lnkHeaderLogout")).click();
		}
		}
	}
}
