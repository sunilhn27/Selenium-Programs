package pakadd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://accounts.google.com/SignUp?hl=en");
		List<WebElement> wb=d.findElements(By.tagName("strong"));
		for(WebElement li:wb){
			String s=li.getText();
			System.out.println(s);
			
			
		}
		

	}

}
