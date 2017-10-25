package taskday2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");
		String s=d.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[2]/td[1]")).getText();
		System.out.println(s);
		d.findElement(By.name("newsletter")).click();
		boolean s1= d.findElement(By.name("newsletter")).isSelected();
		if(s1==true)
		
		System.out.println("yes");
		else{
			System.out.println("no");
		}
		d.findElement(By.name("newsletter")).click();
		
		
		
		
	}

}
