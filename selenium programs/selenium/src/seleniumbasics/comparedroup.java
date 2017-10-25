package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class comparedroup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		WebElement wb = d.findElement(By.id("continents"));
		List<WebElement> droup = wb.findElements(By.tagName("option"));
		int a = droup.size();
		System.out.println(a);

		int c = 0;
		String s7[] = { "Asia", "Europe", "Africa", "Australia", "South America", "North America", "Antartica" };
		int b = s7.length;

		for (WebElement s2 : droup) {

			String s3 = s2.getText();
			System.out.println(s3);

			for (int i = 0; i < s7.length - 1; i++) {
				c++;
				if (b == c) {
					System.out.println("all elements are there " + c);
				}
				if (s3.equalsIgnoreCase(s7[i])) {
					
				}

			}

		}
		System.out.println("pass");
		d.close();

	}

}