package taskday2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkl {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");
		String s=d.findElement(By.xpath(".//*[@id='columnLeft']/div[1]/div[2]/a[9]")).getText();
		System.out.println(s);
		d.findElement(By.xpath(".//*[@id='columnLeft']/div[1]/div[2]/a[9]")).click();
		
		
		
		d.close();
	}

}



