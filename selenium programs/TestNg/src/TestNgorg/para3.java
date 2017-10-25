package TestNgorg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class para3 {
	static WebDriver d;

	@Test(priority = 1)
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.google.co.in");

	}

	@Test(priority = 2)
	@Parameters({ "user"})
	public void uname(String uname) throws InterruptedException {
		System.out.println(uname);
		WebElement wb1 = d.findElement(By.id("lst-ib"));
		wb1.sendKeys(uname);
		
	}
}