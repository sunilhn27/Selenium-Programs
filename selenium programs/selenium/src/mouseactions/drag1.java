package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag1 {

	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
	ChromeDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://jqueryui.com/resources/demos/droppable/default.html");
	WebElement wb=d.findElement(By.id("draggable"));
	WebElement wb1=d.findElement(By.id("droppable"));
	Actions a=new Actions(d);
	a.dragAndDrop(wb, wb1);
	
	Thread.sleep(2000);
	a.build().perform();
	
	
	}
}
