package cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/");
	WebElement wb=d.findElement(By.cssSelector("#user"));
	wb.sendKeys("sunilhn@htmltech.in");
	WebElement password=d.findElement(By.cssSelector("#pass"));
	password.sendKeys("sunil@065");
	wb.submit();	
	d.findElement(By.cssSelector("button[id='lnkHeaderLogout']")).click();
	}

}
