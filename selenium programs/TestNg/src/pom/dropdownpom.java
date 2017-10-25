package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class dropdownpom {

	static WebDriver d;

	static String URl = "http://www.gcrit.com/build3/create_account.php";
	static By drop = By.xpath("//*[@name='country']");

	public void elements() {

		List<WebElement> wb = d.findElements(drop);
		for (WebElement li : wb) {

			System.out.println(li.getText());
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get(URl);
		d.manage().window().maximize();
		dropdownpom d = new dropdownpom();
		d.elements();

	}

	@AfterClass
	public void close() {
		d.close();
	}
}
