package seleniumbasics;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iterator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		WebElement wb = d.findElement(By.id("continents"));
		List<WebElement> droup = wb.findElements(By.tagName("option"));
		ListIterator li = droup.listIterator();
		while(li.hasNext()){
			System.out.println(li.next());
		}
	}

}
