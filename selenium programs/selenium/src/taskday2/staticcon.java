package taskday2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticcon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");
		String s=d.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[1]/h2")).getText();
	System.out.println(s);
	}

}
