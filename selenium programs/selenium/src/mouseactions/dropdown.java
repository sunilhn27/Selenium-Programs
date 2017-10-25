package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/resources/demos/controlgroup/default.html");
		d.manage().window().maximize();
		WebElement wb = d.findElement(By.cssSelector("#car-type-button>span[class='ui-selectmenu-text']"));
		Actions a = new Actions(d);
		a.click(wb);
		for (int i = 1; i <= 4; i++) {
			a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);

			a.build().perform();
			Thread.sleep(2000);
			if (i == 4) {
				a.sendKeys(Keys.ENTER);
			}

		}

	}
}
