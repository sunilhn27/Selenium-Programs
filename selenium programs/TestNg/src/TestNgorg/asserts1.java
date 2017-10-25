package TestNgorg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class asserts1 {
	static WebDriver d;

	@Test(priority = 1)
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	}

	@Test(priority = 2)
	public void data() {
		String s[] = { "Please select","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday", "Saturday" };
		List<WebElement> wb = d.findElements(By.xpath(".//*[@id='select-demo']/option"));
		for (int i=0;i<wb.size();i++) {
			String s1 = wb.get(i).getText();
			System.out.println(s1);
			org.testng.Assert.assertEquals(s[i], wb.get(i).getText(), "pass");

		}

	}
}
