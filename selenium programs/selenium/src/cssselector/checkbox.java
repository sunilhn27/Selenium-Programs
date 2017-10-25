package cssselector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");
		List<WebElement> wb = d.findElements(By.cssSelector("[type$='di']"));
		List<WebElement> label = d.findElements(By.cssSelector(".fieldKey"));
		int s = 0;
		int s1 = 0;
		for (WebElement li : wb) {
			s = wb.size();

		}
		for (WebElement li : label) {
			s1 = label.size();

		}
		System.out.println("no of text box" + s);
		System.out.println("no of label box " + s1);

	}
}
