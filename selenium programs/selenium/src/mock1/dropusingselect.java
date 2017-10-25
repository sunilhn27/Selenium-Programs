package mock1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropusingselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");
	 WebElement wb=d.findElement(By.name("country"));
	 Select sc=new Select(wb);
	List<WebElement>dr= sc.getOptions();
	int a=0;
	for(WebElement li:dr){
		
		String s1=li.getText();
		if(s1.startsWith("N"))
		
			a++;
		System.out.println(s1);
		
	}
	System.out.println("the total no of countries that starts with N is   "+a);
	
	
	 
	}

}
