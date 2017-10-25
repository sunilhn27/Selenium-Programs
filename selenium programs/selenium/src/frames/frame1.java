package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frame1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/WebElement.html");
		List<WebElement> wb = d.findElements(By.tagName("frame"));
		int a = wb.size();
		System.out.println(a);
		d.switchTo().frame(2);
		d.findElement(By.xpath("html/body/div[1]/ul/li[4]/a")).click();
		List<WebElement> wb1 = d.findElements(By.tagName("a"));
		for (WebElement li : wb1) {
			String s = li.getText();
			System.out.println(s);
		}
		
		System.out.println("from other frame");
		d.switchTo().parentFrame();
		WebElement f=d.findElement(By.name("packageFrame"));
		WebDriverWait wait=new WebDriverWait(d,10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(f));
		d.switchTo().frame(f);
		List<WebElement> wb3 =  d.findElements(By.tagName("a"));
		for (WebElement li : wb3) {
			String s1 = li.getText();
			System.out.println(s1);
		}
	}
}
