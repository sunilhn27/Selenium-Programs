package cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class css2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.javatpoint.com/java-tutorial");
		d.manage().window().maximize();
		d.findElement(By.cssSelector("#upr>ol>li>a[href='#java-platforms']")).click();
		
	}

}


