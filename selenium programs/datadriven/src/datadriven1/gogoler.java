package datadriven1;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gogoler {
static WebDriver d;

	
		public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.google.co.in");
		d.manage().window().maximize();

	}

}
