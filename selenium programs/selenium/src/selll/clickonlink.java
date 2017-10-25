package selll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickonlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.javatpoint.com/java-tutorial");
		List<WebElement>links=d.findElements(By.tagName("a"));
		int a = links.size();
		System.out.println(a);
		for (int i = 0; i < a; i++) {

			String s1 = links.get(i).getText();

		
			String s=links.get(i).getAttribute("href");
			
			if(s.equalsIgnoreCase("simple-program-of-java"))
			{
				links.get(i).click();
			}
					
			
		}	
		
	}

}
