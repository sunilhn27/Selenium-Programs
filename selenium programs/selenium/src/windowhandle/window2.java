package windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.naukri.com/international-jobs");
		d.findElement(By.xpath("html/body/div[1]/div/ul/li[2]/a/div")).click();
		String s = d.getWindowHandle();
		Set<String> mainwindow = d.getWindowHandles();
		System.out.println(mainwindow);
		for (String child : mainwindow) {
			if (!(s.equals(child))) {
				d.switchTo().window(child); 
			String s1=d.getWindowHandle();
			System.out.println(s1);
				WebElement	wb=d.findElement(By.xpath(".//*[@id='skill']/div[1]/div[2]/input"));
				
			wb.sendKeys("seleium");
				

				//d.close();
			}
		}
	}

}
