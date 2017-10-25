package cssselector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class csst {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.javatpoint.com/java-tutorial");
		WebElement wb=d.findElement(By.cssSelector(".leftmenu>a[href='how-to-set-path-in-java']"));
		wb.click();
		
		
		

	}

}
