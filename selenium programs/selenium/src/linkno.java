import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class linkno {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");
		d.manage().window().maximize();
		List<WebElement> wb=d.findElements(By.cssSelector(".fieldValue>select>option[value='8']"));
		
		Actions a=new Actions(d);
		a.click();
		a.build().perform();
		
		
		
		
		
		

	}

}
