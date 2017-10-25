package pakadd;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		String s= d.findElement(By.id("hplogo")).getText();
		System.out.println(s);
	}

}
