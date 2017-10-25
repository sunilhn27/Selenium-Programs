package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resize {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://jqueryui.com/resources/demos/resizable/default.html");
		d.manage().window().maximize();
		WebElement wb=d.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		Actions a=new Actions(d);
		a.clickAndHold(wb).moveByOffset(250, 256).release();
		a.build().perform();
		
		
	}
	

}
