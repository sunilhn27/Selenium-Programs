package ScreenShots;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class screen1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		d.manage().window().maximize();
		TakesScreenshot s = (TakesScreenshot) d;
		File f = s.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Sanddep B\\Desktop\\screenshots\\" + d.getTitle() + ".png"));
		WebElement wb = d.findElement(By.cssSelector("#user"));
		Actions a = new Actions(d);
		a.sendKeys("sunilhn@htmltech.in");
		a.moveToElement(d.findElement(By.id("pass"))).click();
		a.sendKeys("sunil@065");
		a.moveToElement(d.findElement(By.id("login_submit"))).click();
		a.build().perform();
		TakesScreenshot s1 = (TakesScreenshot) d;
		File f1 = s.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1,	new File("C:\\Users\\Sanddep B\\Desktop\\screenshots\\" + d.getTitle() + ".png"));
		d.findElement(By.cssSelector("#lnkHeaderLogout")).click();
		TakesScreenshot s2 = (TakesScreenshot) d;
		File f2 = s.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f2,new File("C:\\Users\\Sanddep B\\Desktop\\screenshots\\" +"afterlogout"+d.getTitle() +".png"));
d.close();
	}
}
