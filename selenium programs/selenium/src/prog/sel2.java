package prog;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.guru99.com/");
		String s=d.findElement(By.xpath(".//*[@id='g-above']/div/div/div/div/div/div/div[1]/div[1]/div/h2")).getText();
	System.out.println(s);
	
	}

}
