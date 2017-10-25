package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class newwindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/resizable/");
		WebElement wb = d.findElement(By.xpath(".//*[@id='menu-top']/li[4]/a"));
		d.manage().window().maximize();
		Actions a = new Actions(d);
		a.contextClick(wb).sendKeys(Keys.CONTROL).click(wb);
		a.build().perform();

	}

}
