package taskday1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettexts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.co.in");
		String s=d.findElement(By.className("gb_P")).getText();
		System.out.println(s);
		String s1=d.findElement(By.name("btnK")).getText();
				System.out.println(s1);
	}
}
