package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class higlight {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/");
		WebElement wb = d.findElement(By.xpath(".//*[@id='user']"));
		d.manage().window().maximize();
		Actions a = new Actions(d);
		a.moveToElement(wb).sendKeys("sunil").doubleClick(wb).build().perform();

	}

}
