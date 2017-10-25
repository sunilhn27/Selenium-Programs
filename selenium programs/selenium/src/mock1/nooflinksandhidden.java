package mock1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nooflinksandhidden {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.javatpoint.com/");
		List<WebElement> wb = d.findElements(By.tagName("a"));
		int a = 0;
		int visible = 0;
		int invisible = 0;
		for (WebElement li : wb) {
			a++;

			String s = li.getText();
			if (li.isDisplayed()) {
				visible++;

			} else {
				invisible++;

			}
			System.out.println(s);
		}
		System.out.println(a);
		System.out.println("visible links are" + visible);
		System.out.println("invisible links are" + invisible);
	}
}