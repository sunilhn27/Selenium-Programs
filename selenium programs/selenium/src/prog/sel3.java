package prog;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");
		boolean b=d.findElement(By.name("gender")).isEnabled();
		if(b==true)
		{
	d.findElement(By.name("gender")).click();
	d.findElement(By.name("newsletter")).click();
	d.findElement(By.name("country")).click();
	//d.findElement(By.)
		}
		else{
			System.out.println("no");
		}
	}

}
