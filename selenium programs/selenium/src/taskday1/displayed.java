package taskday1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class displayed {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
			ChromeDriver d = new ChromeDriver();
			d.get("http://www.gcrit.com/build3/create_account.php");
		boolean b=	d.findElement(By.name("firstname")).isDisplayed();
		if(b==true){	
			d.findElement(By.name("firstname")).sendKeys("sunil");
	}
		else{
			System.out.println("element not found");
		}
		d.close();
}
}
