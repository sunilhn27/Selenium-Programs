package mock1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");
		boolean b = d.findElement(By.name("newsletter")).isEnabled();
		
		if(b==true){
			d.findElement(By.name("newsletter")).click();
			Thread.sleep(2000);
			d.findElement(By.name("newsletter")).click();
		}
}
}