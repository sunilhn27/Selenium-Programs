package prog;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class advtsel5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.javatpoint.com/java-tutorial");
		d.manage().window().maximize();
		d.findElement(By.linkText("What is Java")).click();

		d.findElement(By.linkText("History of Java")).click();
		
		
		System.out.println("pass");
		
		d.close();

	}

}
