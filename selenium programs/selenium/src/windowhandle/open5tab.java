package windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class open5tab {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.javatpoint.com/java-tutorial");
		d.manage().window().maximize();
		Actions a = new Actions(d);

		WebElement wb = d.findElement(By.xpath(".//*[@id='menu']/div[2]/a[4]"));
		a.contextClick(wb).sendKeys(Keys.CONTROL).click(wb);

		WebElement wb1 = d.findElement(By.xpath(".//*[@id='menu']/div[2]/a[6]"));
		a.contextClick(wb1).sendKeys(Keys.CONTROL).click(wb1);	a.build().perform();
		WebElement wb2 = d.findElement(By.xpath(".//*[@id='menu']/div[2]/a[9]"));
		a.contextClick(wb2).sendKeys(Keys.CONTROL).click(wb2);	a.build().perform();
		WebElement wb3 = d.findElement(By.xpath(".//*[@id='menu']/div[2]/a[3]"));
		a.contextClick(wb3).sendKeys(Keys.CONTROL).click(wb3);	a.build().perform();
		WebElement wb4 = d.findElement(By.xpath(".//*[@id='menu']/div[2]/a[2]"));
		a.contextClick(wb4).sendKeys(Keys.CONTROL).click(wb4);	a.build().perform();
		a.build().perform();

	}

}
