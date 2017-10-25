package taskday1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class charbtcahr {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");
		String s="sunil";
		for(int a=0;a<=4;a++){
			Thread.sleep(1000);
			s.charAt(a++);
d.findElement(By.name("firstname")).sendKeys(s);


}



	
	}

}