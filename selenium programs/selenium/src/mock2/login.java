package mock2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.amazon.in/");
		WebElement wb = d.findElement(By.id("nav-link-wishlist"));
		WebElement wb1 = d.findElement(By.xpath(".//*[@id='nav-flyout-wishlist']/div[2]/a[2]/span"));
		Actions a = new Actions(d);
		a.moveToElement(wb);
		a.moveToElement(wb1).click();
		a.build().perform();

	}

}
