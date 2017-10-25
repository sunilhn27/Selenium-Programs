package prog;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.javatpoint.com/java-tutorial");
		d.manage().window().maximize();
		int count = 0;
		for (int a = 0; a <= 8; a++) {
			if()
			
			
			d.findElement(By.linkText("What is Java")).click();
			d.findElement(By.linkText("History of Java")).click();
			d.findElement(By.linkText("Features of Java")).click();
			d.findElement(By.linkText("C++ vs Java")).click();
			d.findElement(By.linkText("Hello Java Program")).click();
			d.findElement(By.partialLinkText("Program Intern")).click();
			d.findElement(By.linkText("How to set path?")).click();
			d.findElement(By.linkText("JDK, JRE and JVM")).click();

			d.findElement(By.partialLinkText("Internal Details of JVM")).click();
			d.findElement(By.partialLinkText("Variable and Data Type")).click();
			d.findElement(By.linkText("Unicode System")).click();
			System.out.println("pass");
			System.out.println(a);
		}
		d.close();

	}
}