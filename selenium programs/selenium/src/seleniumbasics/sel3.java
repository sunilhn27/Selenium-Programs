package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		WebElement wb = d.findElement(By.id("lst-ib"));
		wb.sendKeys("selenium");
		String s=wb.getAttribute("value");
		System.out.println(s);
		wb.clear();
		wb.sendKeys("java");
		wb.click();
		String s1=wb.getAttribute("value");
		System.out.println(s1);

		// String s = d.findElement(By.id("lst-ib")).getAttribute("value");
		//System.out.println(s);

	}
}