package cssselector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.javatpoint.com/java-tutorial");
		d.manage().window().maximize();
		WebElement wb=d.findElement(By.cssSelector(".column4>h3"));
		String s=wb.getText();
		System.out.println(s);
		List<WebElement> links=d.findElements(By.cssSelector(".column4>a"));
		for(WebElement li:links){
			String s1=li.getText();
			System.out.println(s1);
		}
		List<WebElement> links1=d.findElements(By.cssSelector(".column4>p"));
		for(WebElement li:links1){
			String s2=li.getText();
			System.out.println(s2);
		

	}

}
}