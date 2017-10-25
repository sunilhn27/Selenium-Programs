package taskday2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext1 {

	
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
				ChromeDriver d = new ChromeDriver();
				d.get("https://www.javatpoint.com/history-of-java");
				String s=d.findElement(By.className("h1")).getText();
				System.out.println(s);
				
			}
		}


