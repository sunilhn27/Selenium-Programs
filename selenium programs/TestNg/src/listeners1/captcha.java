package listeners1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class captcha {
	WebDriver d;

	@Test(priority = 1)
	public void url() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();

	}

	@Test(priority = 2)
	public void cap() {
		d.get("https://www.freshersworld.com/user/register?src=fwloginregbtn");
		d.manage().window().maximize();
		WebElement wb = d.findElement(By.id("captchaView"));
		String s = wb.getText();
		WebElement wb1 = d.findElement(By.id("captcha"));
		wb1.sendKeys(s);
		d.findElement(By.id("refreshCaptcha")).click();
		wb1.clear();
		WebElement w = d.findElement(By.id("captchaView"));
		String s1 = w.getText();
		d.findElement(By.id("captcha")).sendKeys(s1);

	}
}