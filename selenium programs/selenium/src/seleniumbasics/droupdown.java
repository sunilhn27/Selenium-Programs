package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class droupdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");
		WebElement wb = d.findElement(By.name("country"));
		List<WebElement> droup = wb.findElements(By.tagName("option"));

		int f = 0;
		for (WebElement s2 : droup) {
			f++;
			String s4 = "India";
			if (s4.equals(s2)) {
				System.out.println("passdsddddddddddddddddddddddd");

				// System.out.println(s2.getText());
			}

		}
		d.close();
	}

}
