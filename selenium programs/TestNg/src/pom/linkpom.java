package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkpom {
	static String URL = "https://www.javatpoint.com/java-tutorial";
	static WebDriver d;
	static By links = By.xpath(".//*[@id='menu']/div[2]/a");

	public static void links_display() {
		List<WebElement> l = d.findElements(links);
		for (WebElement wb : l) {
			System.out.println(wb.getText());
		}
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get(URL);
		d.manage().window().maximize();
		links_display();
	}
}