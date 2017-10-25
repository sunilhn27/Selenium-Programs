package taskday2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");

		Select s = new Select(d.findElement(By.name("country")));
		boolean b = s.isMultiple();
		System.out.println(b);
		s.selectByValue("24");
		Thread.sleep(1000);
		s.selectByVisibleText("Hong Kong");
		Thread.sleep(1000);
		s.selectByIndex(24);
		
		Thread.sleep(1000);

		// d.close();

	}

}
