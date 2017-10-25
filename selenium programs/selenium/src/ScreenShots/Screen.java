package ScreenShots;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Screen {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		WebElement  wb=d.findElement(By.id("user"));
		wb.sendKeys("sunilhn@htmltech.in");
		WebElement  wb1=d.findElement(By.id("pass"));
		wb1.sendKeys("sunil@065");
		d.findElement(By.id("login_submit")).click();
		d.switchTo().frame("mailFrame");
		d.findElement(By.id("rcmbtn107")).click();
		d.findElement(By.id("rcmbtn121")).click();
		Runtime .getRuntime(). exec("D:\\suniljar\\monster.exe");


	}
}