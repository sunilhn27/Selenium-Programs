package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class list {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("");
		List<WebElement> links = d.findElements(By.tagName("a"));
		System.out.println(links);
		for (WebElement s1 : links) {

			String s2 = s1.getAttribute("href");

			System.out.println(s2);

		}
	}

}
