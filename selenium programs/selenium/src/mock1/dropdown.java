package mock1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");
		WebElement wb = d.findElement(By.name("country"));
		List<WebElement> drop = wb.findElements(By.tagName("option"));
		drop.size();
		for (int i = 0; i <= drop.size(); i++) {
			if (i <= 50) {
				System.out.println(drop.get(i).getText());
				System.out.println(i);
			}

		}

	}
}