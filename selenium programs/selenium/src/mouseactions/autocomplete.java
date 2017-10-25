package mouseactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocomplete {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		d.manage().window().maximize();
		WebElement wb = d.findElement(By.xpath(".//*[@id='lst-ib']"));
		wb.sendKeys("ja");
		Thread.sleep(1000);
		List<WebElement> optionsToSelect = wb.findElements(By.tagName("li"));
		for (WebElement option : optionsToSelect) {
			String s = option.getText();

			System.out.println(s);

		}
	}
}