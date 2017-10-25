package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrolldown {

	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
	ChromeDriver d = new ChromeDriver();
	d.get("https://www.guru99.com/handling-dynamic-selenium-webdriver.html");
	
	d.manage().window().maximize();
	Actions a = new Actions(d);
	for(int i=1;i<=50;i++){
	a.sendKeys(Keys.ARROW_DOWN);
	a.build().perform();
	
}
}
}