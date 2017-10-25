package prog;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.amazon.in/");
		d.manage().window().maximize();
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones");
		d.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		d.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[1]/div/div/a/img")).click();
		
		
		d.close();

	}

}
