package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdesendants {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.javatpoint.com/java-tutorial");
		d.findElement(By.xpath("//div[@class='leftmenu']//descendant::a[5]")).click();
		
	}

}
