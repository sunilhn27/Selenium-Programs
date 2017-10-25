package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.cricbuzz.com/live-cricket-scorecard/17583/sur-vs-ess-south-group-natwest-t20-blast-2017");
		List<WebElement> wb = d.findElements(By.cssSelector("div [class='cb-col cb-col-8 text-right text-bold']"));
		//List<WebElement> wb1 = d.findElements(By.tagName("span"));
		int a=wb.size();
		System.out.println(a);
		for (WebElement li : wb) {

			// String s=li.getAttribute("class");
			String s1 = li.getText();

			// System.out.println(s1);
			System.out.println(s1);
		}

	}
}