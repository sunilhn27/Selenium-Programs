package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdd {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");
		d.findElement(By.xpath("//select[@name='country']//descendant::option[5]")).click();
		

	}

}
