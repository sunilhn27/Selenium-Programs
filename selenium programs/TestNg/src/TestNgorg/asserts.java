package TestNgorg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class asserts {
static WebDriver d;
	
	@Test(priority = 1)
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.gcrit.com/build3/create_account.php");
}

	@Test(priority = 2)
   public void data(){
	   String s[]={"sunil","raju","rajani"};
	   String s1[]={"sunil","raju","rajani"};
		 
			 System.out.println(s);
			 org.testng.Assert.assertEquals(s,s1 , "pass");
			 
			 System.out.println("finished");
			 
		 }
   }
   