package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/resources/demos/draggable/default.html");
		d.manage().window().maximize();
		Actions a=new Actions(d);
		WebElement drag=d.findElement(By.id("draggable"));
		
		a.dragAndDropBy(drag, 150, 600);
		a.build().perform();
		
		
		
	}

}
