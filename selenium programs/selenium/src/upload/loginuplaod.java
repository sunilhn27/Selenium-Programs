package upload;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class loginuplaod {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/");
		WebElement wb = d.findElement(By.cssSelector("#user"));
		Actions a = new Actions(d);
		d.manage().window().maximize();
		a.sendKeys("sunilhn@htmltech.in");
		a.moveToElement(d.findElement(By.id("pass"))).click();
		a.sendKeys("sunil@065");
		a.moveToElement(d.findElement(By.id("login_submit"))).click();
		a.build().perform();
		Thread.sleep(2000);
		List<WebElement> wb1 = d.findElements(By.tagName("iframe"));
		int a1 = wb1.size();
		System.out.println(a1);
		d.switchTo().frame(0);
		d.findElement(By.cssSelector("#rcmbtn107")).click();
		d.findElement(By.cssSelector("#rcmbtn121")).click();
		Runtime.getRuntime().exec("D:/suniljar/mon.exe");

	}

}
