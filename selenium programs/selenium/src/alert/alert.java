package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/viewcart?otracker=Cart_Icon_Click");
		d.findElement(By.xpath(".//*[@id='container']/div/header/div/div[1]/div/ul/li[2]/a")).click();
		Alert a=d.switchTo().alert();
		//String s=a.getText();
	//	System.out.println(s);
		a.dismiss();
		
		
		
		
		
		
		
		
		
		
		
	}

}
