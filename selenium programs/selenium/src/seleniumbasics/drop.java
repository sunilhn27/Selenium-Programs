package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		WebElement wb=d.findElement(By.id("selenium_commands"));
		List<WebElement> li=wb.findElements(By.tagName("option"));
		int a=li.size();
		for(int i=0;i<a;i++){
			String s=li.get(i).getText();
			System.out.println(s);
		String s2[]={"Browser Commands","Navigation Commands","Switch Commands","Wait Commands","WebElement Commands"};	
		
			if(s.equalsIgnoreCase(s2[i])){
				System.out.println("pass");
			}
		}
	}

}
