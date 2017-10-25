import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class count {

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
	ChromeDriver d = new ChromeDriver();
	d.get("http://www.gcrit.com/build3/create_account.php");
	d.manage().window().maximize();
	List<WebElement>wb=d.findElements(By.cssSelector(".fieldValue>select"));
	int a=0;
	for(WebElement li:wb){
		a++;
		String s= li.getText();
		System.out.println(s);
		System.out.println(a);
	}
	
	
}
}