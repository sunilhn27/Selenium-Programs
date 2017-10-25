package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lang2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		WebElement wb=d.findElement(By.id("als"));
		List<WebElement> links=wb.findElements(By.tagName("a"));
		int a=links.size();
		System.out.println(a);
		for(int i=0;i<a;i++){
			String s=links.get(i).getAttribute("href");
		System.out.println(s);	
		
		}

	}

}
