package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectmouse {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/resources/demos/selectable/default.html");
		WebElement wb = d.findElement(By.cssSelector("body>ol#selectable>li:nth-child(3)"));
		WebElement wb1 = d.findElement(By.cssSelector("body>ol#selectable>li:nth-child(4)"));
		Actions a = new Actions(d);
		a.moveToElement(wb);
		a.click();
		a.sendKeys(Keys.CONTROL);
		a.moveToElement(wb1);
		a.click();

		a.build().perform();

	}

}

