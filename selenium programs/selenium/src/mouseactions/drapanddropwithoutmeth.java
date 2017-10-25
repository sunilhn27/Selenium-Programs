package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drapanddropwithoutmeth {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\suniljar\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/resources/demos/draggable/default.html");
        d.manage().window().maximize();
		WebElement wb = d.findElement(By.id("draggable"));
		//WebElement wb1=d.findElement(By.cssSelector("html"));
		
		Actions a=new Actions(d);
		a.clickAndHold(wb).moveByOffset(800,700).release().build().perform();
		
		
		
		
	}

}
