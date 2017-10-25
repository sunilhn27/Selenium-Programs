package datadriven1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class errortxt {
	static WebDriver d;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://recruiter.monsterindia.com/v2/recruiter-sign-up.html");
		d.manage().window().maximize();
		List<WebElement> wb = d.findElements(By.xpath(".//*[@class='error_txt']"));
		System.out.println(wb.size());
		for (WebElement li : wb) {
			String s = li.getText();
			System.out.println(li.getText());
			
		}

	}

}
