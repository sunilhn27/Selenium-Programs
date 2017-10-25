import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dropstop {

	static WebDriver d;
	static int s = 50;

	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");
	}

	@Test

	public void drop() {
		List<WebElement> wb = d.findElements(By.xpath(".//*[@name='country']/option"));
		int a = wb.size();

		for (WebElement li : wb) {
			System.out.println(li.getText());
			if (a == s) {
				break;
			}

		}

	}
}
