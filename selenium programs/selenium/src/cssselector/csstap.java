package cssselector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class csstap {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.javatpoint.com/java-tutorial");
		d.manage().window().maximize();
		List<WebElement> wb = d.findElements(By.cssSelector("#smoothmenu1>ul>li>a"));
		

		for (WebElement li : wb) {
			String s = li.getText();

			System.out.println(s);
		}
	}

}
