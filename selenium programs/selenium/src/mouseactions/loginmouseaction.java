package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class loginmouseaction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/");
		WebElement wb=d.findElement(By.cssSelector("#user"));
		Actions a=new Actions(d);
		a.sendKeys("sunilhn@htmltech.in");
		a.moveToElement(d.findElement(By.id("pass"))).click();
		a.sendKeys("sunil@065");
		a.moveToElement(d.findElement(By.id("login_submit"))).click();
		a.build().perform();
		
		
		
	}

}
