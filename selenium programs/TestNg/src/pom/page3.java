package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class page3 {
	static WebDriver d;
	static String URL = "http://www.seleniumeasy.com/test/basic-first-form-demo.html";

	By text = By.id("user-message");
	By click = By.xpath(".//*[@id='get-input']/button");

	public void entertext(String txt) {

		d.findElement(text).sendKeys(txt);
		d.findElement(click).click();

	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get(URL);
		d.manage().window().maximize();
		page3 p = new page3();
		p.entertext("selenium");
		

	}

}
