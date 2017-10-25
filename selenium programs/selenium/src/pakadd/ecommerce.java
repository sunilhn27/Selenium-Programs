package pakadd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ecommerce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://affiliate-program.amazon.in/welcome/compensation?ac-ms-src=ac-nav");
		d.manage().window().maximize();
		List<WebElement> wb = d.findElements(By.tagName("strong"));
        for(WebElement )
	}

}
