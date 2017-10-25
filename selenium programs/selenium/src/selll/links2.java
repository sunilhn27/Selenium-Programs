package selll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.javatpoint.com/java-tutorial");
		List<WebElement> links = d.findElements(By.tagName("a"));
		int a = links.size();
		System.out.println(a);
		int seenlinks = 0;
		int hiddenlinks = 0;
		for (int i = 0; i < a; i++) {

			String s1 = links.get(i).getText();

			// System.out.println(s1);
			if (links.get(i).isDisplayed()) {
				seenlinks++;

			} else {
				hiddenlinks++;

			}

		}
		System.out.println("hidden links are   " + hiddenlinks);
		System.out.println("seens links are   " + seenlinks);

	}

}
