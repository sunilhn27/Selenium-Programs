package TestNgorg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class compare {

	static WebDriver d;

	@Test(priority = 1)
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.bing.com/");
	}

	@Test(priority = 2)
	public void Test() {
		List<WebElement> wb = d.findElements(By.xpath(".//*[@id='hp_sw_hdr']/div/ul/li"));
		for (WebElement li : wb) {
			String s = li.getText();
			System.out.println(s);
			org.testng.Assert.assertEquals(s, s, "pass");
			li.click();
			d.navigate().to("https://www.bing.com/");
			wb = d.findElements(By.xpath(".//*[@id='hp_sw_hdr']/div/ul/li"));
		}
	}
}
