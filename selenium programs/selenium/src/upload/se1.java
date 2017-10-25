package upload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class se1 {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://my.monsterindia.com/create_account.html");
		d.manage().window().maximize();
		WebElement wb = d.findElement(By.cssSelector("#wordresume"));
		wb.click();
		Runtime.getRuntime().exec("D:/suniljar/mon.exe");
		Thread.sleep(2000);
	}

}
