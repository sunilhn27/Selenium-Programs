package mouseactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sorting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://jqueryui.com/resources/demos/sortable/default.html");
		WebElement wb = d.findElement(By.cssSelector("body>ul[id='sortable']>li:nth-child(7)"));
		WebElement wb1 = d.findElement(By.cssSelector("body>ul[id='sortable']>li:nth-child(1)"));
List<WebElement>s=d.findElements(By.tagName("span"));
int n=s.size();
System.out.println(n);
		Actions a=new Actions(d);
	
	a.clickAndHold(wb).moveToElement(wb1).release(wb).build().perform();
	}

}
