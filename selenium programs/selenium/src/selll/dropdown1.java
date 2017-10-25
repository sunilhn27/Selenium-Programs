package selll;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		Select s=new Select(d.findElement(By.id("selenium_commands")));
		s.selectByVisibleText("Navigation Commands");
		s.selectByVisibleText("Switch Commands");
	//	d.findElement(By.id("continents")).click();
		
		d.close();
		
		
		
		
	}

}
