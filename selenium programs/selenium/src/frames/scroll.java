package frames;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scroll {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.javatpoint.com/");
		 JavascriptExecutor jse = (JavascriptExecutor)d;
		 jse.executeScript("scroll(0, 250)");
		 }
}
