package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.javatpoint.com/");
		List<WebElement> wb=d.findElements(By.tagName("a"));
		int a=wb.size();
		for(int i=0;i<a;i++){
			String s=wb.get(i).getText();
		
			System.out.println(s);
		}
		
	}

}
